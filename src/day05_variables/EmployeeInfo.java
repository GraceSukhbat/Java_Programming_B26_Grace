package day05_variables;

public class EmployeeInfo {

    /* Task
      create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

    Print all the variables
     */
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numberOfPTO;
        double salary;
        boolean isFullTime, isMarried;

        firstName = "James";
        lastName = "Bond";
        companyName = "M16";
        jobTitle = "Special Agent";
        gender = 'M';
        suite = 'D';
        age = 40;
        numberOfPTO = 15;
        salary = 1_000_000; //1,000,000
        isFullTime = true;
        isMarried = false;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        String employeeInfo = firstName + " " + lastName + " is a " + age + " years old, " + gender + " married -> "+ isMarried + " " + " and works at " + companyName + " as a full-time ->" + isFullTime + " " + jobTitle + " in suite " + suite + ". His salary is $" + salary + " per year and gets " + numberOfPTO + " hours of PTO per year.";
        System.out.println(employeeInfo);




    }
}
