package day34_Office_day11_12_03_22_23;

public class P01StringTimesMehmet {
    public static void main(String[] args) {

        String word="Hi";

        stringTimes("Hi", 10);


    }

    public static void stringTimes(String word, int num) {

        String str="";

        for (int i = 0; i < num; i++) {

            str+=word;   // str=str+word ;
        }

        System.out.println(str);


    }

}

