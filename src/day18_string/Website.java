package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the url:");
        String url = input.next();
        url = url.toLowerCase();

//        if(website.startsWith("www") && (website.endsWith(".com") || website.endsWith(".edu") || website.endsWith("gov") || website.endsWith(".net")))
//        {
//
//            System.out.println("Valid website");
//        } else {
//                System.out.println("invalid website");
//            } // my approach

        boolean validStart = url.startsWith("www.");
        boolean validEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");
        if (validStart && validEnd){
            System.out.println(url + " is a valid website");
        } else{

            if(!validStart){
                System.out.println("url needs tp start with www.");
            }
            if(!validEnd){
                System.out.println("url needs to end with .com or .edu or .net or .gov");
            }
        }

        }
    }

