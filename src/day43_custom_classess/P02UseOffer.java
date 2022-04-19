package day43_custom_classess;

public class P02UseOffer {
    public static void main(String[] args) {
        P02Offer offer1 = new P02Offer("Apple", "California");
        System.out.println(offer1);
        P02Offer offer2 = new P02Offer("Facebook", "Sacramento", 120_000);
        System.out.println(offer2);
        P02Offer offer3 = new P02Offer("Bank of America", "Chicago", 130_000, true, 40.0);
        System.out.println(offer3);
    }
}
