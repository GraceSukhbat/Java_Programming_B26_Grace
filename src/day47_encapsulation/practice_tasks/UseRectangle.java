package day47_encapsulation.practice_tasks;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(10, 15);
        System.out.println(obj.getLength());
        System.out.println(obj.getWidth());
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());
        System.out.println(obj);

        Rectangle obj2 = new Rectangle(20, 30);
        System.out.println(obj2);
    }
}
