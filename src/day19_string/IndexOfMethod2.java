package day19_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.indexOf('a')); // 1
        System.out.println(s.lastIndexOf('a')); // 3
        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b')); // 1
        System.out.println(s2.lastIndexOf('b')); // 5

        System.out.println(s2.indexOf("cb")); // 2

        System.out.println(s2.indexOf("cbd")); // -1 --> cbd is not in the String so we get -1
        System.out.println(s2.indexOf('z')); // -1 --> the character z is not in the String so we get -1



    }
}
