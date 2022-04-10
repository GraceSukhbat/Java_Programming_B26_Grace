package day30_arrays;

import java.util.Arrays;

public class P02UrlParts {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";
        String [] separate = url.split("/");
        System.out.println(Arrays.toString(separate).replace(" ", ""));
        System.out.println(separate.length);
        for (int i = 0; i < separate.length; i++) {
            System.out.println(separate[i]);
        }

    }
}
