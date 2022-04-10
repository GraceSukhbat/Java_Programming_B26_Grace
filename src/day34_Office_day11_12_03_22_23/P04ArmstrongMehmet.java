package day34_Office_day11_12_03_22_23;

public class P04ArmstrongMehmet {
    public static void isArmstrong(int number){
        int lastDigit = 0;
        int totalDigits = 0;
        int originalNumber = number;

        while(number > 0){
            lastDigit = number % 10;  // to find last digit
//            System.out.println("last digit " + lastDigit);
            number /= 10; // number = number/10;
            totalDigits += lastDigit*lastDigit*lastDigit;
        }

        if(totalDigits == originalNumber){
            System.out.println(originalNumber);
        }
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            isArmstrong(i);
        }

    }
}
