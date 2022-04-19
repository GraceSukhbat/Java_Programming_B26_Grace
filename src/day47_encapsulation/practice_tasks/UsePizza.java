package day47_encapsulation.practice_tasks;

public class UsePizza {
    public static void main(String[] args) {
        Pizza order = new Pizza("large", 3);
        System.out.println(order);

        order.setTopping(10);
        System.out.println(order);

        Pizza order2 = new Pizza("", -2);

        System.out.println(order2);

        order2.setSize("Small");
        order2.setTopping(1);
        System.out.println(order2);

    }
}
