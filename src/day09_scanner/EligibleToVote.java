package day09_scanner;

public class EligibleToVote {

    /*
        create and assign these variables:
        name
        are they citizen
        do they have criminal background
        age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal record and are above 18
     */
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        boolean isCitizen = true;
        boolean criminalBackground = false;
        boolean isEligibleToVote = age >=18 && isCitizen && !criminalBackground; // true && true && (!false -> true)

        System.out.println(name + " is eligible to vote: " + isEligibleToVote);


    }
}
