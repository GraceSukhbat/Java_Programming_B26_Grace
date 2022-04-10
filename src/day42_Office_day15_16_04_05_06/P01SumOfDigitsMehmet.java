package day42_Office_day15_16_04_05_06;

public class P01SumOfDigitsMehmet {
    public static void main(String[] args) {

        String s = "jav45ai1000sgre1at82";
        //             45 + 1000+ 1 + 82 --> 1128
        System.out.println(sumOfDigits(s));
    }

    private static int sumOfDigits(String str) {
        String digits = "0";

        // Why we used 0 into digits?
        // if we don't have any number in String, it will give us NumberFormatException
        // Since 0 has no effect to result addition (+) operator, we used it to prevent errors
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i);
            } else {
                sum += Integer.parseInt(digits);
                digits = "0";
            }
        }
        return sum + Integer.parseInt(digits);
    }

}
