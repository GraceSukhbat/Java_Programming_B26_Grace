package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // byte value is automatically converted into int because byte is smaller than int

        int i2 = 100;
        byte b2 = (byte) i2; //int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)

        int i3 = 500;
        long l1 = i3; // int is smaller than long, so it will automatically cast

        long l2 = 200;
        int i4 = (int) l2; //I'm trying to go from long to int. long is bigger than int, so I must cast it

        double d = 50;
        int i5 = (int) d; //trying to go from double type to int type. double is bigger, so I need to cast it.
        System.out.println(d);
        System.out.println(i5);
    }

}
