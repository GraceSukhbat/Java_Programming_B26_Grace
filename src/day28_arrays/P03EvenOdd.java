package day28_arrays;

public class P03EvenOdd {
    /* Even and odd from array
Write a program that can count the even and odd number from an array of integers
Ex:
Input: [4,1,3,12,5]
Output: Even: 2
Odd: 3
     */
    public static void main(String[] args) {
        int [] arr = {4, 1, 3, 12, 5};
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr [i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
