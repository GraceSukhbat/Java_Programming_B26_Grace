package day46_static;

public class UseDebitCard {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L, "Grace", 499_000 );
        System.out.println(obj1);

        System.out.println("==================");
        DebitCard obj2 = new DebitCard(12345678911121L, "Saim", 100_000 );
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println("==================");
        DebitCard obj3 = new DebitCard(1234567891112141L, "James", "visa", 1234, 999_000 );
        System.out.println(obj3);

        System.out.println("==================");
        DebitCard obj4 = new DebitCard(1234567891L, "James", "amex", 123, 999_000 ); // invalid values
        System.out.println(obj4);

    }
}
