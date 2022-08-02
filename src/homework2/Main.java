package homework2;

// see UML https://drive.google.com/file/d/1PD01w99AhtCF7aPFwHco0BGjUgzjX3BR/view?usp=sharing
public class Main {
    public static void main(String[] args) {

        // creation of objects: products

        Beverage cocacola = new Beverage("cocacola", "diet soda", 500.0, 10.0, true, "herbs");
        Grocery bread = new Grocery("bread", "wheat", 1.0, 5.0, false, "wheat");
        Health threadmill = new Health("threadmill", "threadmill", 100.0, 500.0, false);
        threadmill.addInsurance(0.10);

        //creating Shop
        Shop shop1 = new Shop("Shop1");


        // adding to list the created products

        Cart cart1 = new Cart();
        cart1.addProduct(cocacola);
        cart1.addProduct(bread);
        cart1.addProduct(threadmill);

        //setting the cart
        shop1.setCart(cart1);

        // Printing the cart and customer details

        cart1.showCart();

        Customer customer1 = new Customer("Sergei", "Zagriychuk", 1);


        customer1.showCustomerDetails();

        // Printing Products detail
        System.out.println(cocacola);
        System.out.println(bread);
        System.out.println(threadmill);

        System.out.println("Total amount of the current cart: " + shop1.totalAmount());

    }
}