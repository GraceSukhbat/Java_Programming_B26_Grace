package day11_if_statements;

public class PracticeTaskGood {
    public static void main(String[] args) {

        int time = 12;
        if ( time >= 6 && time <= 11) {
            System.out.println("Good Morning");
        }

        if (time >= 12 && time <= 16) {
            System.out.println("Good Evening");
        }

        if (time >= 17 && time <=23) {
            System.out.println("Good Night");
        }
    }
}