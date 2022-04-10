package day30_Office_day09_10_03_15_16;

public class P04SameFirstLast {
    /*  Task 04 :  Write a program that accepts String array.Count how many names have the same first and last letter
        Input : "Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"
        Output :    4
        Small Task --> 	Find  the longest word at the same time  --> Donald
     */
    public static void main(String[] args) {
        String [] arr = {"Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet", "Asya"};
        int count = 0;
        String word = "";
        String longest = "";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().charAt(0)== arr[i].charAt(arr[i].length()-1)){
                count++;
                word =arr[i];
            }
            if(word.length() > longest.length()){
                longest = word;
            }

        }
        System.out.println(count);
        System.out.println(longest);


        // Mehmet's approach:

        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        String longestOne="";

        int counter=0;

        for (int i = 0; i <names.length ; i++) {


            String first=names[i].substring(0,1);

            String last =names[i].substring(names[i].length()-1);

            if(first.equalsIgnoreCase(last)){
                if(names[i].length()>longestOne.length()){
                    longestOne=names[i];
                }
                counter++;
            }

        }

        System.out.println(counter);

        System.out.println("longestOne = " + longestOne);


    }
}
