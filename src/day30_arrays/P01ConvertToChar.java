package day30_arrays;

import java.util.Scanner;

public class P01ConvertToChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = input.next();
        char [] arr = name.toCharArray();
        System.out.println(""+ arr[0] + arr[arr.length-1] );
    }
}
