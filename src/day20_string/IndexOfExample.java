package day20_string;

public class IndexOfExample {
    public static void main(String[] args) {
        String word = "banana";
                    // 012345
        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex); //1

        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex); // 5

        int secondIndex = word.indexOf('a', firstIndex + 1);
        System.out.println(secondIndex); // 3

        int thirdIndex = word.indexOf('a' , secondIndex +1);
        System.out.println(thirdIndex); // 5
    }
}
