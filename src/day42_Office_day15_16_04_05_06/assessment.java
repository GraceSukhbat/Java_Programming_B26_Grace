package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;

public class assessment {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.add(-7);
        nums.add(2,2);
        System.out.println(nums);
        nums.remove(2);
        System.out.println(nums);
        nums.add(1, 0);
        System.out.println(nums);
    }
}
