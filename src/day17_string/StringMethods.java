package day17_string;


public class StringMethods {
    public static void main(String[] args) {


        String name = "James";

        //how to compare String values -> use .equals()
        System.out.println(name.equals("James")); // true
        System.out.println("cat".equals("dog")); // false
        System.out.println(name.equals("james")); // false

        System.out.println(name.equalsIgnoreCase("james")); //compares characters while ignoring case sensitivity

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); // true = equals methods is checking the values (in this case, the characters are the same
        System.out.println(a.equals("hello")); // true = compares 'a' object with literal "hello" object

        System.out.println(name.length()); // 5
        String last = "today was fun";
        System.out.println(last.length()); // 13
        System.out.println(last.equals("today")); // false
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN")); // true


    }
}