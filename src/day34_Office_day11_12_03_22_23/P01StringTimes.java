package day34_Office_day11_12_03_22_23;

public class P01StringTimes {
    /*
    Task 1 :    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
     */
    public static void copies(String word, int num){
        for (int i = 0; i < num; i++) {
            System.out.print(word);
        }

    }

    public static void main(String[] args) {
    copies("Hi",3);
    }
}
