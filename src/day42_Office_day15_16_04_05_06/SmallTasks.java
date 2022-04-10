package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallTasks {
    public static void main(String[] args) {
        /*
      Small Tasks (ArrayList)
            1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
            2. write a program that can swap the first and last elements of an ArrayList
            3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
            4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> nums = new ArrayList<>(base);
        ArrayList<Integer> nums2 = new ArrayList<>(base);

        System.out.println(switchLastElement(nums));
        System.out.println(swapFirstLastElement(nums));
        System.out.println(nums2);
        System.out.println(multiplyByTwo(nums2));

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        System.out.println(combineTwoStringArrays(arr1, arr2));

        System.out.println("=== TASK 4 ====");

        String[] arr3 = {"A", "B", "C"},
                arr4 = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr3));
        System.out.println(result);
        result.addAll(Arrays.asList(arr4));
        System.out.println(result);

        System.out.println("=== TASK 4 with CHAR  ====");

        char[] carr1 = {'A', 'B', 'C'},
                carr2 = {'D', 'E', 'F', 'G'};

        ArrayList<Character> charResult = new ArrayList<>();
        //charResult.addAll(Arrays.asList(carr1));
        // to convert char to Character class we need to do it one by one
        for (char eachChar : carr1)  {charResult.add(eachChar);}


        System.out.println(charResult);

        //charResult.addAll(Arrays.asList(carr2));
        for (char eachChar : carr2)  charResult.add(eachChar);

        System.out.println(charResult);


    }

    public static ArrayList<Integer> switchLastElement(ArrayList<Integer> list) {
        list.set(list.size() - 1, 0);
        return list;
    }

    public static ArrayList<Integer> swapFirstLastElement(ArrayList<Integer> list) {
        Collections.swap(list, 0, list.size() - 1);
        return list;
    }

    public static ArrayList<Integer> multiplyByTwo(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) { // it means it is ODD numbers
                result.set(i, list.get(i) * 2);
            }
        }
        return result;
    }

    public static ArrayList<String> combineTwoStringArrays(String[] arr1, String[] arr2) {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr1));
        System.out.println(result);
        result.addAll(Arrays.asList(arr2));
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            result.add(index, arr1[i]);
            index++;
        }
        for (int j = 0; j < arr2.length; j++) {
            result.add(index, arr2[j]);
            index++;
        }
        return result;

    }


}