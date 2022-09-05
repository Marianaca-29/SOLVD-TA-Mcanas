package homework2;

//revise all interfaces, they don't work any more
// pets does not throws total
//change al log error
//is it necessary to create a different shop to each cart?
// see SZ taxation

import homework2.business.Cart;
import homework2.business.Shop;
import homework2.categories.*;
import homework2.customer.Company;
import homework2.customer.Consumer;
import homework2.exceptions.CustomerException;
import homework2.exceptions.DateException;
import homework2.exceptions.PriceException;
import homework2.linkedlist.LinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static homework2.lambdas.StringFunction.*;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class.getName());

    public Main() {
    }

    public static void main(String[] args) throws PriceException, DateException, CustomerException {


        // creation of objects: products and it's different combinations
        // Product 1/6 - Beauty - Only taxes
        BeautyBodyAndPersonalCare shampoo = new BeautyBodyAndPersonalCare("shampoo", "shampoo", 10.0, 10.0, true, true);
        shampoo.addTaxation(5.0);
        BeautyBodyAndPersonalCare conditioner = new BeautyBodyAndPersonalCare("conditioner", "conditioner", 10.0, 10.0, true, true);
        conditioner.addTaxation(5.0);

        // Product 2/6 - Beverage - Only taxes
        Beverage orangejuice = new Beverage("orangejuice", "natural juice", 500.0, 10.0, true, true);
        orangejuice.addTaxation(5.0);
        Beverage cocacola = new Beverage("cocacola", "cocacola", 500.0, 10.0, true, true);
        cocacola.addTaxation(5.0);

        // Product 3/6 - Grocery - Only taxes
        Grocery bread = new Grocery("bread", "wheat", 1.0, 10.0, false, true);
        bread.addTaxation(10.0);
        Grocery pineapple = new Grocery("pineapple", "pineaple", 1.0, 10.0, true, false);
        pineapple.addTaxation(10.0);

        // Product 4/6 - Health -  Insurance and taxes
        Health threadmill = new Health("threadmill", "threadmill", 10.0, 10.0, false);
        threadmill.addInsurance(10.0, 10.0);
        threadmill.addTaxation(10.0);
        Health rollerskate = new Health("rollerskate", "rollerskate", 0.500, 10.0, false);
        rollerskate.addInsurance(10.0, 10.0);
        rollerskate.addTaxation(10.0);

        // Product 5/6 - Household  - Only taxes
        HouseHold cleanser = new HouseHold("cleanser", "cleanser", 100.0, 10.0, true, false);
        cleanser.addTaxation(10.0);
        HouseHold gloves = new HouseHold("gloves", "gloves", 0.500, 10.0, false, true);
        gloves.addTaxation(10.0);

        // Product 6/6 - Pet -  Insurance and taxes
        Pet dog = new Pet("dog", "dog", 500.0, 10.0, false);
        dog.addInsurance(10.0, 10.0);
        dog.addTaxation(10.0);
        Pet goldfish = new Pet("goldfish", "goldfish", 0.100, 10.0, false);
        goldfish.addInsurance(10.0, 10.0);
        goldfish.addTaxation(10.0);

        // creating Shop
        Shop shop1 = new Shop("Shop1");
        Shop shop2 = new Shop("Shop2");

        // creating cart 1 and adding to list or "cart" the created products

        Cart cart1 = new Cart();
        cart1.addProduct(shampoo);
        cart1.addProduct(orangejuice);
        cart1.addProduct(bread);
        cart1.addProduct(threadmill);
        cart1.addProduct(cleanser);
        cart1.addProduct(dog);

        // creating cart 2 and adding to list or "cart" the created products
        Cart cart2 = new Cart();
        cart2.addProduct(conditioner);
        cart2.addProduct(cocacola);
        cart2.addProduct(pineapple);
        cart2.addProduct(rollerskate);


        // creating cart 3 and adding to list or "cart" the created products

        Cart cart3 = new Cart();
        cart3.addProduct(gloves);
        cart3.addProduct(goldfish);
        // setting the cart the each created shop
        shop1.setCart(cart1);
        shop2.setCart(cart2);
        shop1.setCart(cart3);

        // Creating customer and its details

        Consumer consumer1 = new Consumer("Sergei", "Zagriychuk", 1, true, 29, 10, 1990);
        Consumer consumer2 = new Consumer("Sergei", "Zagriychuk", 1, true, 20, 11, 1992);
        Company company1 = new Company("Solvd", "inc", 2, "12345678910");
        LinkedList<Consumer> consumerwithfidelityp = new LinkedList<>();

        //this shows the cart and it's products (product to String and sow cart)
        cart1.showCart();
        logger.info("Total amount of the current cart: " + shop1.calculateAmountForCustomer(consumer1));

        cart2.showCart();
        logger.info("Total amount of the current cart: " + shop1.calculateAmountForCustomer(company1));

        //Printed Likedlist of Customers attended this day
        shop1.addConsumerWF(consumerwithfidelityp, consumer1);
        shop1.addConsumerWF(consumerwithfidelityp, consumer2);
        logger.info(consumerwithfidelityp.getCount());

        //lambdas calling
        printFormatted("Is there anything you would like to add", asking);
        printFormatted("no", answering);
        printFormatted("There isn't anything you would like to add, Have a Nice Day", saying);
    }


}