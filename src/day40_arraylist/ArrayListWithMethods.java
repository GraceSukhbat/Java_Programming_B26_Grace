package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek());


        ArrayList<String> days = getDayOfWeek();
        System.out.println(days.get(0));

        System.out.println(getDayOfWeek().get(0));

        System.out.println(printList(getDayOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list));

    }

    public static String printList(ArrayList<String> list){
        String str = "LIST: ";
        for(String each : list){
            str += "\n~\t" + each;
        }
        return str;
    }
    public static ArrayList<String> getDayOfWeek(){
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;
    }
    /*
    String a = "abc"
    a = a.toUpperCase().replace("a", "d").trim();
    a = a.toUpperCase()
    .replace("a", "d")
    .trim();
     */
}
