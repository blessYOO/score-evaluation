package grade;

/**
 * 기본 과목 학점 계산 클래스
 *
 * @since 2024.02.25
 * @author syyoo
 * */
public class BasicEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String grade;

        /* 조건 하나일 때는 중괄호 안닫아도 됨 */
        if(point >= 90 && point <= 100){
            grade = "A";
        }
        else if (point >= 80) {
            grade = "B";
        } else if (point >= 70) {
            grade = "C";
        } else if (point >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }}
