package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P07RemoveCountries {
    /*
    Remove Countries
Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */
    public static ArrayList<String> removeCountries(ArrayList<String> countries) {
        countries.removeIf(name -> name.length() >= 7);
        return countries;
//        ArrayList<String> result = new ArrayList<>();
//        for (String name: countries) {
//            if(name.length() <= 7){
//                result.add(name);
//            }
//        }
//        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(removeCountries(input));
    }
}