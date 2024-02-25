package school;

import java.util.ArrayList;

/**
 * 학교 전체 인원 관리 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class School {
    //TODO: SCHOOL에 있어야 하는 것들...
    public static School instance = new School();
    private static String SCHOOL_HOME = "good school";
    private ArrayList<Score> scoreList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    /** 클래스 생성자 */
    public School() {
    }

    /** 객체 생성 */
    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(Score score) {
        scoreList.add(score);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Student student) {
        studentList.add(student);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(Subject subject) {
        subjectList.add(subject);
    }

    @Override
    public String toString() {
        return "School{" +
                "scoreList=" + scoreList +
                ", studentList=" + studentList +
                ", subjectList=" + subjectList +
                '}';
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }
}
