package day04_variables;

public class School {
    /*
     Practice Task:
     class name: School
     declare and assign these variables
     number of students in grade 1
     number of students in grade 2
     number of students in grade 3
     number of students in grade 4
     number of students in grade 5
     total number of students in your school
     number of days in a year (have some half day = ~100.5)
     number of snow days in a year (double)
     average GPA in school (3.5)
     print all the variables with unique messages
     */
    public static void main(String[] args) {
        int numberOfStudentInGrade1 = 20;
        int numberOfStudentInGrade2 = 25;
        int numberOfStudentInGrade3 = 30;
        int numberOfStudentInGrade4 = 35;
        int numberOfStudentInGrade5 = 40;
        int totalNumberOfStudents = numberOfStudentInGrade1 + numberOfStudentInGrade2 + numberOfStudentInGrade3 + numberOfStudentInGrade4 + numberOfStudentInGrade5;

        double numberOfDaysInYear = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.6;

        System.out.println("numberOfStudentInGrade1 = " + numberOfStudentInGrade1);
        System.out.println("numberOfStudentInGrade2 = " + numberOfStudentInGrade2);
        System.out.println("numberOfStudentInGrade3 = " + numberOfStudentInGrade3);
        System.out.println("numberOfStudentInGrade4 = " + numberOfStudentInGrade4);
        System.out.println("numberOfStudentInGrade5 = " + numberOfStudentInGrade5);
        System.out.println("totalNumberOfStudents = " + totalNumberOfStudents);
        System.out.println("Number of Days " + numberOfDaysInYear);
        System.out.println("Number of Snow Days " + numberOfSnowDays);
        System.out.println("average gpa " + averageGpaInSchool);


    }



}


