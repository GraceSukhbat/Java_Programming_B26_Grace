package Day27_Office_day08_03_09;

public class P03UniqueCharacters {
    public static void main(String[] args) {
        /* Task 06: Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
         */

        // Manually

        String str = "aabdfccfs";
        System.out.println(str.indexOf("a")); // 0
        System.out.println(str.lastIndexOf("a")); // 1

        // Dynamic
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);

            boolean isUnique = str.indexOf(each) == str.lastIndexOf(each);
            if(isUnique){
                System.out.print(each);
            }
        }

    }
}
