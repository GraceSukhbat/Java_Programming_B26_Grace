package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        /*
        ArrayList is resizeable - array implementation of List interface

        What is the difference ArrayList and Arrays?
        ArrayList
            - Does not have fixed size
            - Stores ONLY OBJECTS
            - Allows Duplicates Values
            - Maintains insertion order

        Array

            - have fixed length
            - Stores OBJECTS and PRIMITIVES

         */

        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        // add(Object):  adds the elements to the indexes of the arraylist
        cities.add("London");
        cities.add("Chicago");
        cities.add("Baku");
        cities.add("Istanbul");
        cities.add("Astana");
        cities.add("Virginia");

        // One shot
        ArrayList<String> cities02 = new ArrayList<>(Arrays.asList("London", "Izmir", "Astana"));

        // Other way
        ArrayList<String> cities03 = new ArrayList<>();
        cities03.addAll(Arrays.asList("London", "Izmir", "Astana"));

        // After this point we will use cities

        // add(index, Object): adds the element to the given index (index must be exist)

        System.out.println("-----add(index, Object)--------");
        cities.add(0, "Kyiv");
        System.out.println(cities);


        // get(index): returns the element at given index
        System.out.println("-----get(index)--------");
        System.out.println(cities.get(0));

        // set(index, Object): replaces the old element at given index with new element
        System.out.println("-----set(index, Object)--------");
        cities.set(0, "Dushanbe");
        System.out.println(cities.get(0));

        // indexOf(Object): returns the first matching object' index number
        System.out.println("-----indexOf(Object)--------");
        System.out.println(cities.indexOf("Dushanbe"));

        // size(): returns the total number of elements
        System.out.println("-----size()--------");
        System.out.println(cities.size());

        // remove(index): removes the object at the given index
        System.out.println("-----remove(index)--------");
        System.out.println(cities.remove(0)); // returns removed value
        System.out.println(cities);

        // remove(object): removes the first matching object
        System.out.println("-----remove(object)--------");
        System.out.println(cities.remove("London"));
        System.out.println(cities);

        //  Bulk Op.

        // removeAll() : to remove multiple elements
        cities.removeAll(Arrays.asList("Chicago", "Baku"));
        System.out.println(cities);

        // retainAll() : to retain multiple elements
        cities.retainAll(Arrays.asList("Astana"));
        System.out.println(cities);

        // addAll()  :  adds collection of elements to the list
        cities.addAll(Arrays.asList("Izmir", "Baku", "Mexico City"));
        System.out.println(cities);

        // removeIf()  : removes element according to condition
        System.out.println("-------removeIf-----------");
        cities.removeIf(each -> each.length() > 5);
        System.out.println(cities);

        // containsAll(): checks if all elements are contained in the list
        System.out.println(cities.containsAll(Arrays.asList("Izmir", "Baku"))); // true


        // clear(): removes all the objects from the List
        System.out.println("-----clear()--------");
        cities.clear();
        System.out.println(cities);


        // isEmpty(): returns true if the list contains no element
        System.out.println(cities.isEmpty()); // true
    }
}
