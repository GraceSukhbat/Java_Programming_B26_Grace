package day44_custom_classes;

public class OfferV2 {
    String location, company;
    double salary, numOfPTO;
    boolean isFullTime;

    public OfferV2(String company, String location){
        this.company = company;
        this.location = location;
    }
    public OfferV2(String company, String location, double salary){
        this(company, location);
        this.salary = salary;
    }
    public OfferV2(String company, String location, double salary, boolean isFullTime, double numOfPTO){
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

    public String toString() {
        String info = company + " located in " + location;

        info += "\n " + (salary > 0 ? salary : "");

        info += "\n " + (isFullTime ? "Full Time" : "Contract");

        return info;
    }
}
