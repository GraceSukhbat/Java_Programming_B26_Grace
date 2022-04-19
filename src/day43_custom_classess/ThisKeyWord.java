package day43_custom_classess;

public class ThisKeyWord {

    int a = 100; // instance variable a
    public ThisKeyWord(int a){ // local variable a
        a=400;
        System.out.println(a);
        this.a = 600; // assigning 600 to instance variable
    }
}
