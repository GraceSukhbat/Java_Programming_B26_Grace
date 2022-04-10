package day22_loops;

public class Letters {
    public static void main(String[] args) {
        //a - z lowercase
        char lowercaseUp = 'a';

        while(lowercaseUp <= 'z'){
            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }

        System.out.println();

        // Z - A uppercase

        char uppercaseBack = 'Z';

        while(uppercaseBack >= 'A'){
            System.out.print(uppercaseBack + " ");
            uppercaseBack--;
        }


    }
}
