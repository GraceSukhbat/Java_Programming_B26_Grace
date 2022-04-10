package day32_arrays;

public class P04LastCharacter {
    /*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines
Ex:
	{"James", "is", "back"}
	{"he", "was", "never", "gone"}
	{"methods", "tomorrow"}
Output:
	ssk
	esre
	sw
     */
    public static void main(String[] args) {
        String[][] arr = {{"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};
        String lastLetter = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                lastLetter += arr[i][j].charAt(arr[i][j].length() - 1);

            }
            System.out.println(lastLetter);
            lastLetter = "";
        }
// Saim's approach
//        for(String [] eachArray : arr){
//
//            for(String eachWord : eachArray){
//                System.out.print(eachWord.charAt(eachWord.length() - 1)); // arr[i][j].charAt(arr[i][j].length() -1));
//            }
//            System.out.println();
//
//        }
    }
}

