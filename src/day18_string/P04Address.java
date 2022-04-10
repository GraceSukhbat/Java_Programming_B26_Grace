package day18_string;

import java.util.Scanner;

public class P04Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address = input.nextLine();
        address = address.trim().toUpperCase();
        String message = "";

        if(address.startsWith("500")){
            message = "house is on the right side";
        } else if(address.startsWith("600")){
            message = "house is on the left side";
        }
        if(address.contains("DRIVE")){
            message+= "\nhouse on drive";
        } else if(address.contains("LANE")){
            message+="\nhouse on lane";
        } else if(address.contains("AVE")){
            message+="\nhouse on avenue";
        }
        System.out.println(address + "\n" + message);
    }
}
