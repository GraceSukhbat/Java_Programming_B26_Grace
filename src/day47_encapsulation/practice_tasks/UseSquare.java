package day47_encapsulation.practice_tasks;

public class UseSquare {
    public static void main(String[] args) {
        Square obj = new Square(10);
        System.out.println(obj);
        System.out.println(obj.calculateArea());
        obj.setSide(15);
        System.out.println(obj.getSide());
        System.out.println(obj.calculatePerimeter());
        System.out.println(obj);
    }
}
