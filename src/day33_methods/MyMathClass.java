package day33_methods;

public class MyMathClass {
    public static void add(double numOne, double numTwo){
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
    }
    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
    }
    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
    }
    public static void division(double numOne, double numTwo){
        if(numTwo !=0) {
            System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        } else {
            System.out.println("cannot divide by 0");
        }
    }

    public static void main(String[] args) {
        add(4.5, 6.1);
        add(4, 6);
//        int a = add(3.4, 12.2); we cannot assign anything because our methods are void, there is no return value

        division(4, 0);
        subtract(9, 5);
        multiply(10, 50);
    }
}
