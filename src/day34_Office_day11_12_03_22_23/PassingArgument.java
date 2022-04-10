package day34_Office_day11_12_03_22_23;

public class PassingArgument {
    public static void main(String[] args) {
        sum(3,4);
        int a = 3;
        int b = 4;
        sum(a, b);

        // sum(3.3, 4); // compiler can only do Implicit Casting
        sum((int)3.3, 4); // we did the casting Explicitly
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

}
