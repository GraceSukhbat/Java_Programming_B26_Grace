package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name ="Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;
        // we cannot call instance methods like this:
//        App.run();
//        App.update();

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo); // day42_custom_classes.App@2812cbfa

        new App().run(); // this creates an object with no reference and calls the run method

        new Scanner(System.in).nextLine();

    }
}
