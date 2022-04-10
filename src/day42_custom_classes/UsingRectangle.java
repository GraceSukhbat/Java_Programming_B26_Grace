package day42_custom_classes;

import java.awt.*;

public class UsingRectangle {
    public static void main(String[] args) {
        P01Rectangle object1 = new P01Rectangle();
        object1.base = 15.5;
        object1.height = 10;

        System.out.println(object1);

        object1.calculatePerimeter();
        object1.area();
        System.out.println(object1);

    }
}
