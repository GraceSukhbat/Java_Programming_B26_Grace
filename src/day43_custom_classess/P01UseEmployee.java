package day43_custom_classess;

public class P01UseEmployee {
    public static void main(String[] args) {
        P01Employee employee1 = new P01Employee("Grace", "SDET");
        System.out.println(employee1);
        P01Employee employee2 = new P01Employee("Olga", 8, "SDET", 100000);
        System.out.println(employee2);
    }
}
