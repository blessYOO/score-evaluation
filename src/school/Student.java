package school;

import java.util.ArrayList;

/**
 * 학생 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class Student {
    /** 학번 */
    private int studentId;
    /** 학생 이름 */
    private String studentName;
    /** 필수 과목 */
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<>();

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", majorSubject='" + majorSubject + '\'' +
                '}';
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }
}
