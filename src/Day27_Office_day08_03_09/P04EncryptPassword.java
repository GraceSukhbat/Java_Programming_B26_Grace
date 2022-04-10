package Day27_Office_day08_03_09;

public class P04EncryptPassword {
    public static void main(String[] args) {

        String password = "cydeo";
        String encrypted = "";

        for(int i = 0; i < password.length(); i++){
            char each = password.charAt(i);
            encrypted += each + "x";

        }
        System.out.println(encrypted);

    }
}
