package day05_variables;

public class MyName {

    public static void main(String[] args) {
        char letterOne = 'G';
        char letterTwo = 'r';
        char letterThree = 'a';
        char letterFour = 'c';
        char letterFive = 'e';
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);

        System.out.println("My Name Is: " + letterOne + letterTwo + letterThree + letterFour + letterFive);
    // or you can make a variable of the name

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive;
        System.out.println(name);
        System.out.println("My name is: " + name);
    }
}
