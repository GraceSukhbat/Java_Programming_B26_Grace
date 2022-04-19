package day47_encapsulation.practice_tasks;

public class Pizza {
    /*
    create a class called Pizza
- data:
size (String), number of toppings
- constructor
- create a constructor that creates a Pizza object with the size and the topping
call setters here
- encapsulate the Pizza class
- setter condition:
size can only be:
small, medium, or large
number of toppings must be a positive number
- other methods methods:
- calculatePrice()
calculate the price of the pizza based on:
small base: $4
medium base: $6
large base: $8
each topping adds $0.75 to the price
calculate the total price and return the cost
- toString()
print the size, number of toppings, and cost of the pizza
Create a separate class to create and test the Pizza objects
     */

    private String size;
    private int topping;

    public Pizza(String size, int topping){
        setSize(size);
        setTopping(topping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch(size.toLowerCase()){
            case "small":
            case "medium":
            case "large":
                this.size = size;
        }
    }

    public int getTopping() {
            return topping;
    }

    public void setTopping(int topping) {
        if(topping >0){
            this.topping = topping;
        }
    }
    public double calculatePrice(){
        if(size == null){
            return -1;
        }
        double price = size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;
        return price + (topping * 0.75);
//        if(size == "small"){
//            price = 4 + topping * 0.75;
//        } else if(size == "medium"){
//            price = 6 + topping * 0.75;
//        } else {
//            price = 8 + topping * 0.75;
//        }
//        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", topping=" + topping +
                ", price=" + calculatePrice()+
                '}';
    }
}
