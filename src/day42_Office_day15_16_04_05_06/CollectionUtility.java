package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        // sort()    : sort the given collection
        // reverse() : reverse the order of the elements in given collection
        // max()     : returns the biggest element
        // min()     : returns the smallest element
        // swap()    : swap the elements in the collection with their indexes
        // frequency(c,o):
        // c – the collection in which to determine the frequency of o
        //o – the object whose frequency is to be determined

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,-5,0,-1,30,7,8,20,20,20));

        System.out.println("--------SORT----------");
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("--------REVERSE----------");
        Collections.reverse(numbers);
        System.out.println(numbers);

        System.out.println("--------MAX----------");
        System.out.println(Collections.max(numbers));

        System.out.println("--------MIN----------");
        System.out.println(Collections.min(numbers));

        /*
        find the second max number from arraylist
         */

        numbers.removeIf(each -> Collections.max(numbers) == each);
        // it will remove first max value from arraylist
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

        numbers.removeIf(each -> Collections.max(numbers) == each);
        int thirdMax = Collections.max(numbers);
        System.out.println( thirdMax);

        System.out.println("--------SWAP----------");
        Collections.swap(numbers, 0 , numbers.size()-1);
        System.out.println(numbers);

        System.out.println("--------FREQ----------");

        System.out.println(Collections.frequency(numbers, 10));

    }
}
