package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        // String msg = sayHello(); this is not valid because the method is void, there is no return value

        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){ // String return type
        return "Bye";
    }

}
