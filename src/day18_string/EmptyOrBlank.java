package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "last example";
        System.out.println(str.isEmpty()); // false

        str = "";
        System.out.println(str.isEmpty()); // true

        String s = " ";
        System.out.println("s is empty: " + s.isEmpty()); // false --> space is a character

        System.out.println("s is blank: " + s.isBlank()); // true --> there is a blank space, no actual characters (isBlank method checks for only white spaces)

        String s2 = "    ";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

    }
}
