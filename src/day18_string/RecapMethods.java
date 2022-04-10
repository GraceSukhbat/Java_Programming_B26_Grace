package day18_string;

public class RecapMethods {
    public static void main(String[] args) {
        String s = "pen"; // String literal --> it is in the String pool

        String s2 = new String("pen"); // String key word --> object in the heap

        System.out.println("Compare with == " + (s == s2)); // false

        System.out.println("Compare with .equals() " + (s.equals(s2))); // true
        System.out.println("compare with .equals() " + s.equals("Pen")); // false
        System.out.println("compare with .equalsIgnoreCase() " + s.equalsIgnoreCase("Pen")); // true
        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }

        int len = s.length();// you can store it to a variable
        System.out.println(len);
        System.out.println(s.length());

        if(s.length() >4) {
            System.out.println("long word");
        }else{
                System.out.println("short word");

            }

        System.out.println(("aaaa").length()); //4

        System.out.println(("aa aa").length()); //5 including space

        }


    }

