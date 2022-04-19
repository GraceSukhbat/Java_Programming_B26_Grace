package day45_Office_day15_16_04_12_13.customClasses;

public class CustomMain {
    public static void main(String[] args) {

        // Create a new OBJECT from CustomClassIntro

        new CustomClassIntro();
        // there is no reference

        System.out.println("=============");
        CustomClassIntro c = new CustomClassIntro();
        System.out.println(c);

        System.out.println("===============");
        // call instance variable
        c.instanceVariable = "Instance Variable from Main Method";
        System.out.println(c);

        System.out.println("===============");
        // call instance method
        c.instanceMethod();
        System.out.println(c);

        // Create a new OBJECT

        System.out.println("===============");
        CustomClassIntro c2 = new CustomClassIntro();
        System.out.println(c2);

    }
}
