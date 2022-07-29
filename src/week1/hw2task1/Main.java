package week1.hw2task1;

// see UML https://drive.google.com/file/d/1PD01w99AhtCF7aPFwHco0BGjUgzjX3BR/view?usp=sharing
public class Main {
    public static void main(String[] args) {

        // creation of objects: products

        Beverages cocacola = new Beverages("cocacola", "diet soda", 500.0, 10.0, true, "herbs");
        Groceries bread = new Groceries("bread", "wheat", 1.0, 5.0, false, "wheat");

        // adding to list the created products

        Cart cart1 = new Cart();
        cart1.addProduct(cocacola);
        cart1.addProduct(bread);

        // Printing the cart and customer details

        cart1.showCart();

        Customer customer1 = new Customer("Sergei", "Zagriychuk", 1, cart1);

        System.out.println(cart1.totalAmount());
        customer1.showCustomerCart();

        // Printing Products detail
        System.out.println(cocacola);
        System.out.println(bread);
    }
}