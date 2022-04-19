package day43_custom_classess;

public class P01Employee {
    /*
    create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */
    String name;
    int ID;
    String jobTitle;
    double salary;
    public P01Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public P01Employee(String name, int ID, String jobTitle, double salary){
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }

    public String toString() {
        String obj = name;
        if(jobTitle != null){
            obj += " | " + jobTitle;
        }
        if(ID !=0){
            obj += " | " + ID;
        }
        if(salary !=0){
            obj +=" | " + salary;
        }
        return obj;
    }
}
