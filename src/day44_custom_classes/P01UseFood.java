package day44_custom_classes;

public class P01UseFood {
    public static void main(String[] args) {

        P01Food item1 = new P01Food("apple");
        System.out.println(item1);
        P01Food item2 = new P01Food("orange", 5);

        P01Food item3 = new P01Food("yogurt", 4, 2.99);

    }
}
