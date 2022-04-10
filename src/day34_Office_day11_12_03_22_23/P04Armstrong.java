package day34_Office_day11_12_03_22_23;

public class P04Armstrong {
    /*
    Task 4 :   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.


                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153
     */
    public static void  armstrongNumber (int number){

        // 1 5 3
        int firstDigit = number /100;
        int secondDigit = (number - firstDigit*100)/10;
        int thirdDigit = number - firstDigit*100 - secondDigit *10;
        int[] arr = {firstDigit, secondDigit, thirdDigit};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum += arr[i]*arr[i]*arr[i];
        }
        if(sum == number){
            System.out.println(number + " is an armstrong number");
//        } else {
//            System.out.println(number + " is not an armstrong number");
        }
//        System.out.println(sum);
//        System.out.println(firstDigit);
//        System.out.println(secondDigit);
//        System.out.println(thirdDigit);
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            armstrongNumber(i);
        }
    }
}
