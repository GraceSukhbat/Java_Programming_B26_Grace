package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);

        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]

        System.out.println(group.get(0)); // Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Ozi");
        System.out.println(group); // [Victor, Ziba, Ozi]  by default, Ozi is added to the end of array
        group.add(1, "James");
        System.out.println(group); // [Victor, Ziba, Ozi]

        System.out.println(group.add("Emre")); // returns boolean
        System.out.println(group);

    }
}
