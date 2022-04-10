package day30_arrays;

public class P04MultipleWords {
    public static void main(String[] args) {
        String[] arr= {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains(" ")){
                System.out.println(arr[i]);
            }
        }
    }
}
