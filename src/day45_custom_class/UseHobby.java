package day45_custom_class;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHobby {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("Chess");
        System.out.println(hobby1);
        hobby1.annualCost = 500;
        hobby1.requiresOther = true;
        hobby1.isOutdoors = false;
        System.out.println(hobby1);

        Hobby hobby2 = new Hobby("Tennis", 800, true, true);

        ArrayList <Hobby> allHobbies = new ArrayList<>();
        allHobbies.add(hobby1);
        allHobbies.add(hobby2);
        System.out.println(allHobbies);

        allHobbies.add(new Hobby("Computer Game", 550, false, true));

        allHobbies.addAll(Arrays.asList(
                new Hobby("Puzzle", 200, false, false),
                new Hobby("Reading", 300, false, false),
                new Hobby("Basketball", 100, true, true),
                new Hobby("Cooking", 600, false, false),
                new Hobby("Biking", 250, true, false)

        ));
        System.out.println(allHobbies);

        for( Hobby each: allHobbies){
            each.doIt();
        }
        ArrayList<Hobby> outdoors = new ArrayList<>(allHobbies);
        outdoors.removeIf(each -> each.isOutdoors);
        System.out.println("====only indoor hobbies====");
        System.out.println(outdoors);

        ArrayList<Hobby> performedAlone = new ArrayList<>(allHobbies);
        performedAlone.removeIf(each -> each.requiresOther);
        System.out.println("====hobbies that do not require others====");
        System.out.println(performedAlone);

        ArrayList<Hobby> costMore = new ArrayList<>(allHobbies);
        costMore.removeIf(each -> each.annualCost > 500);
        System.out.println("====hobbies that cost more than $500 annually====");
        System.out.println(costMore);
    }
}
