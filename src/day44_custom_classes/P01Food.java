package day44_custom_classes;

public class P01Food {

    String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;

    public P01Food(String name) {
        this.name = name;
    }
    public P01Food(String name,int quantity){
        this(name);
        this.quantity = quantity;
    }
    public P01Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }
    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    public String toString() {
        return "Item: " + name + " ~ " + quantity + " x " + unitPrice + " for $" + totalPrice;
    }

}

