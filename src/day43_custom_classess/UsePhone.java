package day43_custom_classess;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone X"); // calls the constructor on line 20
        System.out.println(phone1);
        Phone phone2 = new Phone("iPhone 12", "Apple"); // calls the constructor on line 23
        System.out.println(phone2);

        Phone phone3 = new Phone("Galaxy s 22", "Samsung", 128, 10.2); // calls the constructor on line 28
        System.out.println(phone3);
    }
}
