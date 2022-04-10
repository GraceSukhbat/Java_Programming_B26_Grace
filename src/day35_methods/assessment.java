package day35_methods;



import java.util.Arrays;

public class assessment {
    public static void main(String[] args) {
        int [] num1 = new int[3];
        System.out.println(Arrays.toString(num1));
        int [] num2 = {1, 2, 3, 4};
        num1 = num2;
        System.out.println(Arrays.toString(num1));




        String a = "today I will go to the beach";
        String b = a.substring(12);
        boolean c = b.startsWith("go");
        System.out.println(c);
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        String str = "cydeo";
        for (int i = 0; i <= str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
        double [] d = {3.4, 5.2, 5.1, 1.0};


        int [] nums = {1, 2, 3, 4, 5};

        nums [3] = nums[2];
        System.out.println(Arrays.toString(nums));
        String [] str10 = {"cat", "dog", "kite"};
        int bd = str10[3].length();
        System.out.println(bd);
    }


}
