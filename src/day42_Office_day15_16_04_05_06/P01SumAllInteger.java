package day42_Office_day15_16_04_05_06;

public class P01SumAllInteger {
    /*
    Task 1 : Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128

     */
    public static int sumOfAllIntegers(String str) {


        int sum = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                temp +=each;
            } else {
                if(!temp.isEmpty()){
                    sum+= Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "jav45ai1000sgre1at82";
        System.out.println(sumOfAllIntegers(s));
    }
}