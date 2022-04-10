package Day27_Office_day08_03_09;

public class P05CamelCase2 {
    public static void main(String[] args) {
        String str = "neverGiveUp";
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if(i == 0){
                camelCase += ("" + eachLetter).toUpperCase();
            } else if (eachLetter >= 'A' && eachLetter <= 'Z') {
                camelCase += "\n"+ ("" + eachLetter) ;
            } else {
                camelCase +="" + str.charAt(i);
            }
            }

        System.out.println(camelCase);

        }
    }

