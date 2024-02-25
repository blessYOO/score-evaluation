package grade;

/**
 * 필수 과목 학점 계산 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class MajorEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String grade;

        if(point >= 95 && point <= 100){
            grade = "S";
        }
        else if (point >= 90) {
            grade = new String("A");
        } else if (point >= 80) {
            grade = "B";
        } else if (point >= 70){
            grade = "C";
        } else if (point >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
