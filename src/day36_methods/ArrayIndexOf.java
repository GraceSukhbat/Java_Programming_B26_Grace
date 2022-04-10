package day36_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int [] arr = {12, 5, 1, 5, 2, 6,5};
        System.out.println(indexOf(arr, 20)); // -1
        System.out.println(indexOf(arr, 2)); // 4
        System.out.println(indexOf(arr, 5)); // 1
        String [] words = {"java", "apple", "water", "hello"};
        System.out.println(indexOf(words, "hello")); // 3

    }

    public static int indexOf(String [] strs, String element){
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int [] nums, int element){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == element){
                return i;
            }
        }
        return -1;
    }
}
