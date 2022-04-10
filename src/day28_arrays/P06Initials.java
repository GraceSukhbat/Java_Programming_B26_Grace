package day28_arrays;

public class P06Initials {
    public static void main(String[] args) {
        /*Initials
Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
Ex: Input:
[ “James Bond”, “Eve Rell”, “Anna Johnson” ]
Output:
JB
ER
AJ
         */
        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        String initials = "";
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (names[i].charAt(j) == ' ') {
                    initials = "" + names[i].charAt(0) + names[i].charAt(j + 1);
                }
            }
            System.out.println(initials);
        }

    }
}


