package report;


import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = "수강생 학점\t\t\n";
    public static final String HEADER = "이름 || 학번 || 필수과목 || 점수 \n";
    public static final String LINE = "----------------------------------\n";

    private StringBuffer sb = new StringBuffer();

    public String getReport(){

        ArrayList<Subject> subjectList = school.getSubjectList();

        for(Subject subject:subjectList){
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        /* string 으로 결과값 반환 */
        return sb.toString();
    }

    private void makeFooter() {
        sb.append("\n");
    }

    private void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();

        for(int i=0;i<studentList.size();i++){
            Student student = studentList.get(i);
            sb.append(student.getStudentName());
            sb.append("|");
            sb.append(student.getStudentId());
            sb.append("|");
            sb.append(student.getMajorSubject());
            sb.append("|");

            getScoreGrade(student, subject.getSubjectId());

            sb.append("\n");
            sb.append(LINE);
        }
    }

    private void getScoreGrade(Student student, int subjectId) {
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};

        for(int i=0;i<scoreList.size();i++){
            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectId() == subjectId){
                String grade;
                if(score.getSubject().getSubjectId() == majorId){
                    grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                }else{
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                }

                sb.append(score.getPoint());
                sb.append(":");
                sb.append(grade);
                sb.append("|");

            }
        }
    }

    private void makeHeader(Subject subject) {
        sb.append(GenerateGradeReport.LINE);
        sb.append("\t"+subject.getSubjectName());
        sb.append(GenerateGradeReport.TITLE);
        sb.append(GenerateGradeReport.HEADER);
        sb.append(GenerateGradeReport.LINE);
    }


}
