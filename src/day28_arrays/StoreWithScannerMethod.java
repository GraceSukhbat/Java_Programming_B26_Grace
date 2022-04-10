package day28_arrays;

import java.util.Scanner;

public class StoreWithScannerMethod {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};
        Scanner input = new Scanner(System.in);
        System.out.println("What are you looking for?");
        String lookingFor = input.nextLine();
        boolean inStock = false;
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase(lookingFor)){
                inStock = true;
                break;
            }
        }
        System.out.println(lookingFor + (inStock? " in stock" : " out of stock"));
    }
}
