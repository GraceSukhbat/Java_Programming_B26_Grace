package day15_switch_statements;

public class PracticeTaskSeasonFinder {
    /* Season Finder
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:  2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {
        int month = 11;
        String season ="";
        String message = "";
        boolean isValid = true;

        switch (month){
            case 12: case 1: case 2:
                season ="Winter";
                message = "wear a winter coat, gloves and a hat";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                message = "wear a light jacket";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                message = "it is a bikini season";
                break;
            case 9: case 10: case 11:
                season = "Fall";
                message = "go to a pumpkin patch or apple orchard";
                break;
            default:
                message = "incorrect entry";
                isValid = false;

        }
        if(isValid){
            System.out.println("This is a " + season + " season and " + message);
        } else{
            System.out.println(message);
        }

    }
}
