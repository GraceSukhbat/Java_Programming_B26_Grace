package day26_nested_loops;

public class P01Shape {
    public static void main(String[] args) {

        // outer loop
        for(int j = 0; j < 8; j++){

            // inner loop
            for(int i = 0; i < 9; i++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
