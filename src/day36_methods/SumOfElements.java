package day36_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 2};
        System.out.println(sum(arr));

        System.out.println(sum(4, 6, 2, 6, 12, 4)); // line 12 allows us to type the array elements here instead o declaring array
    }


    public static int sum(int ... nums){
        int sum = 0;
        for( int each : nums){
            sum += each;
        }
        return sum;
    }

    // normal version
//    public static int sum(int [] nums){
//        int sum = 0;
//        for( int each : nums){
//            sum += each;
//        }
//        return sum;
//    }
}
