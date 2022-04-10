package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you want to store?");
        int friendNum = input.nextInt();
        String[] friendList = new String[friendNum];

        for(int i = 0; i < friendNum; i++){
            System.out.println("Enter friend's name");

            friendList [i] = input.next();
        }

        System.out.println(Arrays.toString(friendList));
    }
}
