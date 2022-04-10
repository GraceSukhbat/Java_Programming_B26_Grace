package day29_arrays;

import java.util.Scanner;

public class P03Countries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        for (int i = 0; i < countries.length; i++) {
            System.out.print("" + countries[i].charAt(0) +countries[i].charAt(countries[i].length()-1) + " ");
            }

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].endsWith("a")) {
                System.out.println(countries[i]);
            }
        }

        System.out.println("Enter a country name to check");
        String name = input.nextLine();
        int count = 0;
        for (int i = 0; i < countries.length; i++){
            if(countries[i].toLowerCase().contains(name)){
                //System.out.println(name + " is on the list");
                count++;
            }

                //System.out.println(name + " is not on the list");
            }

            if(count > 0) {
                System.out.println(name + " is on the list");
            } else {
                System.out.println(name + " is not the list");
            }
        }
    }

