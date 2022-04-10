package day24_loops;


public class P06CamelCase {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
	Today is SUNDAY
Output:
todayIsSunday
     */
    public static void main(String[] args) {
        String str = "Today is Sunday";
        str = str.toLowerCase();
        String newStr = "";

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                str = str.replace("" +str.charAt(i+1), ("" + str.charAt(i+1)).toUpperCase());
            }
            newStr +=str.charAt(i);
        }
        System.out.println(newStr.replace(" ", ""));
    }
}
