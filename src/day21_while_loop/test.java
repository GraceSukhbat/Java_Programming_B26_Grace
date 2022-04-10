package day21_while_loop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:

            if(word.contains("java")){
                if(word.startsWith("java")) {
                    exists = true;
                    System.out.println(exists);
                } else if(word.substring(1,5).startsWith("java")){
                    exists = true;
                    System.out.println(exists);
                } else{
                    System.out.println(exists);
                    System.out.println("The 'java' is not in position 0 or 1");
                }
            }else {
                System.out.println(exists);
                System.out.println("The 'java' is not in position 0 or 1");
            }



    }
}
