package Day12_if_statements;

public class PracticeTaskRetake {
    /*  create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
	If it is the first attempt -> subtract 10%
	If it is the second attempt -> subtract 20%
	If it is the third attempt -> subtract 35%
Based on the retake attempt number calculate the final grade
     */
    public static void main(String[] args) {

        int grade = 100;
        int attemptNumber = 3;
        if (attemptNumber == 1) {
            grade = grade - (grade * 10 / 100);
            System.out.println("Final grade: " + grade);
        } else if (attemptNumber == 2) {
            grade = grade - (grade * 20 / 100);
            System.out.println("Final grade: " + grade);
        } else if (attemptNumber == 3) {
            grade = grade - (grade * 35 / 100);
            System.out.println("Final grade: " + grade);
        }
    }
}
