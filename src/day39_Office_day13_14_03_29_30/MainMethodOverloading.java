package day39_Office_day13_14_03_29_30;

public class MainMethodOverloading {
    public static void main(char[] args){
        System.out.println("Hello from char main");
    }

    public static void main(String[] args) {
        // Can we overload main method?
        // Yes, we can.

        System.out.println("Hello from String main");

    }

    public static void main(int [] args){
        System.out.println("Hello from int main");
    }

    public static void main(double[] args){
        System.out.println("Hello from double main");

    }

}
