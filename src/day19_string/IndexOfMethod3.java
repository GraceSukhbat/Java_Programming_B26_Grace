package day19_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";
                    // 0123456789

        System.out.println("first i: " + word.indexOf('i'));
        System.out.println("last i: " + word.lastIndexOf('i'));

        // System.out.println("second i: " + word.indexOf('i', 3)); cannot use 3 because this is the index of first 'i'
        System.out.println("second i: " + word.indexOf('i', 4)); // starting at position: 4 --> nition
        System.out.println("third i: " + word.indexOf('i', 6)); // starting at position: 6 --> tion

        String s = "applep";
        System.out.println(s.indexOf('p' , 2)); // 2
        System.out.println(s.indexOf('p', 3)); // 5

    }
}
