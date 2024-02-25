package school;

import java.util.ArrayList;

/**
 * 과목 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class Subject {
    /** 과목코드 */
    private int subjectId;
    /** 과목이름 */
    private String subjectName;

    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void register(Student student) {
        studentList.add(student);
    }
}
