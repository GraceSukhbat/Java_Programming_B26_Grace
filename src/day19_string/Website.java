package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a url");
        String url = input.next(); // www.google.com
                                    //012345678910
        url = url.substring(4, url.length() - 4);
        System.out.println(url);
        //url = url.substring(4, 10) -> doesn't work for all inputs, because 10 is hardcoded




    }
}
