package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {
        System.out.println("My name starts with \"P\" and ends with 'G'.");

        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed once");
        System.out.println("\t\tThis was tabbed twice");


        // examples of next lines
        System.out.println(); //before learning \n -> next line, the list would have been like this
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) wash car");

        System.out.println("\n1) Go to store\n2) grab milk\n3) wash car");
    }
}
