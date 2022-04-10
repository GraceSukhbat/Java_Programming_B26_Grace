package day28_arrays;

public class AddElements {
    public static void main(String[] args) {


        int [] numbers  = {3, 6, 10};
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            total +=numbers[i];
        }
        System.out.println(total);
    }

}
