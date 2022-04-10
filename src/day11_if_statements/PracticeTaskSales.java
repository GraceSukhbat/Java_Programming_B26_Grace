package day11_if_statements;

public class PracticeTaskSales {
    public static void main(String[] args) {
        double salesAmount = 12000;
        if(salesAmount < 10000){
            System.out.println("no bonus");
        }
        if(salesAmount >=10000 && salesAmount < 15000){
            System.out.println("bonus is $5000");
        }
        if(salesAmount >=15000){
            System.out.println("bonus is $7000");
        }
    }
}
