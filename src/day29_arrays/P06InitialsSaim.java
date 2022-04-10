package day29_arrays;

public class P06InitialsSaim {
    public static void main(String[] args) {
        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        for (int i = 0; i < names.length; i++) {
            String fullName = names[i];
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();// --> could also do  indexOf(" ") +1
            System.out.println(""+ fullName.charAt(0) + lastName.charAt(0));
        }

        for (String str : names) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

            // option 2:
//            str = str.trim();
//            System.out.println(str.substring(0, 1) + str.substring(str.indexOf(" ")).trim().charAt(0));
        }
    }
}
