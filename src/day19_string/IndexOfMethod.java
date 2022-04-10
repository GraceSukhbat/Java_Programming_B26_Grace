package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        System.out.println(s.indexOf("p")); // 0
        System.out.println(s.indexOf("e")); //1
        System.out.println(s.indexOf("n")); // 2

        System.out.println(s.indexOf("x")); // -1
        System.out.println(s.indexOf("pe")); // 0 because p starts at 0
        System.out.println(s.indexOf("pz")); // needs to match the whole sequence --> -1

        String s1 = "apple";

        System.out.println(s.indexOf('a')); // 0
        System.out.println(s.indexOf("p")); // 1
        System.out.println(s.indexOf("ppl")); // 1
        System.out.println(s.indexOf("le")); // 3
        System.out.println(s.indexOf("pear")); // -1

    }
}
