package day23_loops;

public class P04RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcabc";
        for(int i = 0; i < str.length()-1; i++) {
        if(str.substring(i+1, str.length()).contains(str.substring(i,i+1))){

            str=str.substring(i+1);
        }
        }
        System.out.println(str);
        }
    }


