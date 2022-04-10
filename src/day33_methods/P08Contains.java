package day33_methods;

public class P08Contains {
    /* Create a method that accepts an int array and a number. Check if the array contains that number or not
Ex:
input: ( {1, 2, 3, 4}, 4 ) -> true
input: ( {1, 2, 3, 4}, 7 ) -> false
     */
    public static void contains(int [] numbers, int num){
        String result = "";
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] == num){
                result = "true";
            } else{
                result = "false";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        contains(new int []{1, 2, 3, 4}, 4);
        contains(new int[]{1, 2, 3, 4}, 7);
    }
}
