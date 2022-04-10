package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02GradeBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char [] grade = new char[5];
        String [] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] scores = {80, 54, 100, 66, 94};
        for (int i = 0; i < names.length; i++) {
            if(scores[i] > 85){
                grade[i] = 'A';
            } else if(scores[i] > 75){
                grade[i] = 'B';
            } else if(scores[i] > 65){
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
            System.out.println(names[i] + " | " + scores[i] + " | " + grade[i]);
            }
        }
    }

