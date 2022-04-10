package day39_Office_day13_14_03_29_30;

public class Login {
    public static void main(String[] args) {
        boolean isLoginSuccess = login("Cydeo", "Cydeo123");
        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        } else{
            System.out.println("Check your password");
        }

        System.out.println("=======================");

        isLoginSuccess = login();
        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        } else {
            System.out.println("Check your password");
        }
    }

    public static boolean login(String username, String password){
        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
            return false;
        }

    public static boolean login(){
        String username = getUsername();
        String password = getPassword();
        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;
    }
    public static String getUsername(){
        // Assume that we get this infor from external file
        return "Cydeo";
    }
    public static String getPassword(){
        // Assume that we get this infor from external file
        return "Cydeo123";
    }

    }

