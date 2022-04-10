package day34_Office_day11_12_03_22_23;

public class P03RemoveSpace {
    /*
    Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
     */
    public static void removeSpace(String sentence){
        String [] s = sentence.trim().split(" ");

        String result = "";
        for(String each : s){
            if(!each.isEmpty()){
                result += each + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeSpace("   Hello    world        I     love      java");
    }
}
