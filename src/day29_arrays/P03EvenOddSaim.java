package day29_arrays;

public class P03EvenOddSaim {
    public static void main(String[] args) {
        int [] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] % 2 == 0){
//                even++;
//                evenNums += nums[i] + " ";
//            } else {
//                odd++;
//                oddNums += nums[i] + " ";
//            }
//        }
        for (int number : nums) {
            if(number % 2 ==0){
                even++;
                evenNums += number + " ";
            } else {
                odd++;
                oddNums += number + " ";
            }
        }
        System.out.println("Even counter: "+ even);
        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd counter: "+ odd);
        System.out.println("Odd numbers: " + oddNums);
    }
}
