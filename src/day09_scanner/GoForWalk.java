package day09_scanner;

public class GoForWalk {

    public static void main(String[] args) {
        // We want to go for a walk
        // We will go for a walk if it is not raining and the weather is above 70
        //there is no need to check the weather if it is raining

        boolean isRaining = true;
        int temp = 80;

        System.out.println( !isRaining && temp > 70 ); //
    }
}
