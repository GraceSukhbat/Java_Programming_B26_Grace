package day44_custom_classes;

public class EmployeeV2 {
    String name;
    int ID;
    String jobTitle;
    double salary;
    public EmployeeV2(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public EmployeeV2(String name, int ID, String jobTitle, double salary){
        this(name, jobTitle);
        this.ID = ID;
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
