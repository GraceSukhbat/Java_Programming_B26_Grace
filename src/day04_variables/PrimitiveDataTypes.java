package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte age = 60; //declared and assigned a variable value
        System.out.println("age");
        System.out.println(age);

//        byte age2 = 200; 200 is too big for byte type

        short year;  //declared a variable called year. It is short type
        year = 2022; //assigned 2022 into my year variable
        year = 2023; //reassigns the value to be 2023, it changes it

        int addressNumber = 2444400;

//        long bigNumber = 1948184098776887; the value is int type, it is too big for int

        //long bigNumber = 1948184098776887L; <- correct way
        long bigNumber;
        bigNumber = 1948184098776887L; //adding L at the end of the number, it tells compiler that is a Long number.

    }

}
