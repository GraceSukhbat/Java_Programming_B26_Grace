package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "sunday";
        //            012345
        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(3)); // day
        System.out.println(str); // still sunday
        System.out.println("satur" + str.substring(3)); // saturday

        System.out.println(str.substring(2 , 4)); // nd
        System.out.println(str.substring(0 , 5)); // sunda
        System.out.println(str.substring(0 , 6)); // okay, because the index 6 is just the stopping point
//        System.out.println(str.substring(0 , 7));  out of bounds because 6 index is read


    }
}
