package day19_string;

public class P03RelativeChecker {
    public static void main(String[] args) {
        String nameOne = "Take Grzyb";
        String nameTwo = "Stanley Grzyb";
        int lenOne = nameOne.length();
        int spaceIndexOne = nameOne.indexOf(' ');
        int lenTwo = nameTwo.length();
        int spaceIndexTwo = nameTwo.indexOf(' ');
        String lastNameOne = nameOne.substring(spaceIndexOne + 1, lenOne );
        String lastNameTwo = nameTwo.substring(spaceIndexTwo +1, lenTwo );
        if(lastNameOne.equals(lastNameTwo)){
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }
        System.out.println(lastNameOne);
        System.out.println(lastNameTwo);
        System.out.println(lenOne);
    }
}
