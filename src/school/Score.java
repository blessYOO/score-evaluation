package school;

/**
 * 점수 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class Score {
    private int studentId;
    /** 점수 */
    private int point;
    Subject subject;

    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId=" + studentId +
                ", point=" + point +
                ", subject=" + subject +
                '}';
    }
}
