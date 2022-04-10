package day38_arraylist;

import java.util.ArrayList;

public class P02 {
    /*
    Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Iron Man");
        System.out.println(str);
        str.add("Spider Man");
        System.out.println(str);
        str.add("Thor");
        System.out.println(str);
        str.add("Captain America");
        System.out.println(str);
        str.add("Hawkeye");
        System.out.println(str);
        str.remove(2);
        System.out.println(str);
        str.remove("Iron Man");
        System.out.println(str);
        str.remove(0);
        System.out.println(str);


    }
}
