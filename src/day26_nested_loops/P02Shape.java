package day26_nested_loops;

public class P02Shape {
    public static void main(String[] args) {

        // outer loop
        for(int j = 0; j < 9; j++){

            // inner loop
            for(int i = 0; i < j; i++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
