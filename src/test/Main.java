package test;

import report.GenerateGradeReport;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

public class Main {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main (String[] args){
        Main test = new Main();
        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    private void createStudent() {
        Student student1 = new Student(181213, "안성원", korean);
        Student student2 = new Student(181214, "유선영", math);
        Student student3 = new Student(181215, "우원재", korean);
        Student student4 = new Student(181216, "이희준", korean);
        Student student5 = new Student(181217, "김길주", math);

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);
        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);
        addScoreForStudent(student3, korean, 33);
        addScoreForStudent(student3, math, 22);
        addScoreForStudent(student4, korean, 85);
        addScoreForStudent(student4, math, 70);
        addScoreForStudent(student5, korean, 66);
        addScoreForStudent(student5, math, 90);
    }

    private void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }

    private void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }
}
