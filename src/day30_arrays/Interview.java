package day30_arrays;

public class Interview {
    public static void main(String[] args) {
        // username longer than 3 characters
        // starts with 3 a
        String username = "";

        if(username.length() > 3 && username.startsWith("aaa")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }
}
