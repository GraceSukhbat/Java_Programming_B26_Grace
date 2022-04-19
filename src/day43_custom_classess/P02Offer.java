package day43_custom_classess;

public class P02Offer {
    /*    create a class called Offer
        - data:
            location, company, salary, is full time, number of PTO
        - constructor
            - create a constructor that creates an Offer object with the company and location
            - create a constructor that creates an Offer object with the company, location, and salary
            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO
        - method:
            toString()
                print all the employees information
    Create a separate class to create and test the Offer objects
     */
    String location, company;
    public double salary;
    double numOfPTO;
    public boolean isFullTime;

    public P02Offer(String company, String location){
        this.company = company;
        this.location = location;
    }
    public P02Offer(String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public P02Offer(String company, String location, double salary, boolean isFullTime, double numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

    public String toString() {
        String info = "\n" + company + " located in " + location;

        info += " - " + (salary > 0 ? salary : "");

        info += " - " + (isFullTime ? "Full Time" : "Contract");

//        if(isFullTime ){
//            info += " | full time";
//        }
        info += " - " + (numOfPTO > 0 ? numOfPTO : "");

//        if(numOfPTO !=0){
//            info += " | " + numOfPTO;
//        }

        return info;
    }
}
