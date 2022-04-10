package day05_variables;

public class CharExamples {
    public static void main(String[] args) {
        // assigning characters to char type
        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9'; // this is not number 9, it is character 9.
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // every character has a number assigned to it (ascii value). you won't get a + Z, instead it is 187

        char letterThree = 65; //number related to the character -> 65 is letter A in ascii table
        System.out.println(letterThree);
        //char letterThree = '65'; this is invalid because there is two characters

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);// original 97 + 90 + 65 + 57 + 36 = 345

        System.out.println(letterOne + " "+ letterTwo + " "+ letterThree + " " +numberOne + " " + specialOne); //spaces in between each char

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne); // String in the beginning
        //when you concatenate with a String, the result is a String type

    }
}
