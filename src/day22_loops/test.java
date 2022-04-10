package day22_loops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int year = 0;
        int growth = 1;
        int treeSize = 0;

        while(year <10){
            treeSize += growth;
            year++;
            if(year==3){
                growth = 2;
            }
            System.out.println("Year " + year + " - growth " + growth +" cm\ntree size: " + treeSize + " cm");
        }
    }
}
