package day09_scanner;

public class Exercise {

      /*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions
     */
      public static void main(String[] args) {
          boolean isItWeekend = true;
          boolean areYouATeacher = true;
          boolean areYouAPolice = false;
          boolean areYouAFirefighter = false;

          boolean discount = isItWeekend &&
                  (areYouATeacher || areYouAPolice || areYouAFirefighter); // must be weekend and one of the three statements needs to be true in order to get a discount -> in this example we have to group them ()
          System.out.println("Did you get a discount? " + discount);
      }
}
