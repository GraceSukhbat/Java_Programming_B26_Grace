package Day12_if_statements;

import java.util.Scanner;

public class PracticeTaskChooseLanguage {
    /*
    create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French
based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 5 based on the language preference" + "\n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
        int num = input.nextInt();
        String message;
        if(num == 1){
            message = "\"hello, thank for your call\"";
        } else if(num == 2){
            message = "\"hola, gracias para llamar\"";
        } else if(num == 3){
            message = "\"merhaba, aradiginiz icin tesekkurler\"";
        } else if(num == 4){
            message = "\"privet, spasibo za vash zvonok\"";
        } else if(num == 5){
            message = "\"Merci, pour votre appel\"";
        } else {
            message = "\"We will use English by default\"";
        }
        System.out.println(message);
    }
}
