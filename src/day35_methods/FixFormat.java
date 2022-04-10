package day35_methods;

public class FixFormat {
    /* Fix Format
create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase
Ex:
	Input:
		jamES
	Output:
		James
     */
    public static String fixFormat(String str1) {
        str1 = str1.trim();
        return str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();
    }
}
