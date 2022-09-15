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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


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
        Health threadmill = new Health("threadmill", "threadmill", 10.0, 10.0, true);
        threadmill.addInsurance(10.0, 10.0);
        threadmill.addTaxation(10.0);
        Health rollerskate = new Health("rollerskate", "rollerskate", 0.500, 10.0, true);
        rollerskate.addInsurance(10.0, 10.0);
        rollerskate.addTaxation(10.0);

        // Product 5/6 - Household  - Only taxes
        HouseHold cleanser = new HouseHold("cleanser", "cleanser", 100.0, 10.0, true, false);
        cleanser.addTaxation(10.0);
        HouseHold gloves = new HouseHold("gloves", "gloves", 0.500, 10.0, false, true);
        gloves.addTaxation(10.0);

        // Product 6/6 - Pet -  Insurance and taxes
        Pet dog = new Pet("dog", "dog", 500.0, 1000.0, false);
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

        // creating cart 2 and adding to list or "cart" the created products
        Cart cart2 = new Cart();
        cart2.addProduct(conditioner);
        cart2.addProduct(cocacola);
        cart2.addProduct(pineapple);
        cart2.addProduct(rollerskate);


        // creating cart 3 and adding to list or "cart" the created products

        Cart cart3 = new Cart();
        cart3.addProduct(dog);
        cart3.addProduct(gloves);
        cart3.addProduct(goldfish);

        // setting the cart the each created shop
        shop1.setCart(cart1);
        shop2.setCart(cart2);
        shop1.setCart(cart3);

        // Creating customer and its details

        Consumer consumer1 = new Consumer("Sergei", "Zagriychuk", 1, true, 29, 10, 1990);
        Consumer consumer2 = new Consumer("Andrei", "Zagriychuk", 1, true, 20, 11, 1992);
        Company company1 = new Company("Solvd", "inc", 2, "12345678910");


        //this shows the cart and it's products (product to String and show cart)

        // ***** Cart 1 *****

        logger.info("Total amount of the current cart: $ " + shop1.calculateAmountForCustomer(consumer1));
        cart1.showCart();
        //streams
        logger.info("Total of products is: ");
        cart1.countCart();
        //Usage of lambda
        logger.info("I want to filter by name of product, and it's name is : <<shampoo>>");
        cart1.getFieldOfProductsBy(product -> product.getName() == "shampoo");
        logger.info("I want to filter by price of product, and it's price under <<$ 16 >>");
        cart1.getFieldOfProductsBy(product -> product.getPrice() < 16);
        //Usage of Streams
        logger.info("Names printed in Uppercase: ");
        cart1.productNamesToUpperCase();
        logger.info("Products printed in alphabetical order: ");
        cart1.productOrdered();
        logger.info(" ---- End of purchase N°1 ---- ");


        // ***** Cart 2 *****

        logger.info("Total amount of the current cart: $ " + shop1.calculateAmountForCustomer(company1));
        cart2.showCart();
        //streams
        logger.info("Total of products is: ");
        cart2.countCart();
        //Usage of lambda
        logger.info("I want to filter by name of product, and it's name is : <<coca cola>>");
        cart1.getFieldOfProductsBy(product -> product.getName() == "cocacola");
        logger.info("I want to filter by weight of product, and it's weight under << 1 oz >>");
        cart2.getFieldOfProductsBy(product -> product.getWeight() == 1);
        //Usage of Streams
        logger.info("Names printed in Uppercase: ");
        cart2.productNamesToUpperCase();
        logger.info("Products printed in alphabetical order: ");
        cart2.productOrdered();
        logger.info(" ---- End of purchase N°2 ---- ");
        // ***** Cart 3 *****

        logger.info("Total amount of the current cart: $ " + shop1.calculateAmountForCustomer(consumer2));
        cart3.showCart();
        //streams
        logger.info("Total of products is: ");
        cart3.countCart();
        logger.info("I want to filter by attribute of product, and it's price over << $100 >>");
        //Usage of lambda
        cart3.getFieldOfProductsBy(product -> product.getPrice() > 100);
        //Usage of Streams
        logger.info("Names printed in Uppercase: ");
        cart3.productNamesToUpperCase();
        logger.info("Products printed in alphabetical order: ");
        cart3.productOrdered();
        logger.info("---- End of purchase N°3 ----");

        //Printed Linkedlist of Customers attended this day
        shop1.addConsumerWF(consumer1);
        shop1.addConsumerWF(consumer2);
        logger.info("The total of consumers with fidelity program is:  " + shop1.consumerwithfidelityp.getCount() + ", and the names of consumers are: ");
        shop1.displayFidelity();
        logger.info("Products of the store that had been purchased and have refrigeration are: ");
        shop1.addConsumerWTN(cocacola);
        shop1.addConsumerWTN(orangejuice);
        //Added this logic to filter a product if it's refrigerated, given it's stored in different place (in all shop)
        shop1.streamingRefrigerated();

    }

}