package day45_custom_class;

public class Hobby {

    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOther;

    public Hobby(String name){
        this.name = name;
    }
    public Hobby(String name, double annualCost){
        this(name);
        this.annualCost = annualCost;
    }
    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOther){
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOther = requiresOther;
    }

    public void doIt(){
        System.out.println("Doing " + name + (isOutdoors ? " outdoors" : " indoors"));
    }

    public String toString(){
        String info = "\n"+name + " costs $" + annualCost + " annually";
        info += " - " + (isOutdoors ? "outdoors" : "indoors");
        info += " - " + (requiresOther ? " requires others" : "does not require others");
        return info;
    }
}
