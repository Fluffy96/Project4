package proj4.project4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PepperoniTest {

    @Test
    public void testDefault() {
        Pepperoni testSmall = new Pepperoni("small");
        double price = testSmall.getprice();
        assertEquals(price, 8.99, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 10.99, .01);

        Pepperoni testLarge = new Pepperoni("large");
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 12.99, .01);

    }

    /**
     * Test removing Pepperoni. There is no toppings but the price should still be 8.99 for small
     * 10.99 for medium and 12.99 for large.
     */
    @Test
    public void removeDefaultTopping() {
        Pepperoni testSmall = new Pepperoni("small");
        testSmall.toppings.remove(Topping.PEPPERONI);
        double price = testSmall.getprice();
        assertEquals(price, 8.99, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        testMedium.toppings.remove(Topping.PEPPERONI);
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 10.99, .01);

        Pepperoni testLarge = new Pepperoni("large");
        testLarge.toppings.remove(Topping.PEPPERONI);
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 12.99, .01);
    }
    /**
     * Test for calculating price with 6 toppings for each pizza size.
     */
    @Test
    public void testSixToppings() {
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.ONION);
        toppings.add(Topping.MUSHROOM);
        toppings.add(Topping.CHICKEN);
        toppings.add(Topping.PINEAPPLE);
        toppings.add(Topping.HAM);
        toppings.add(Topping.PEPPERONI);

        Pepperoni testSmall = new Pepperoni("small");
        testSmall.setToppings(toppings);
        double price = testSmall.getprice();
        assertEquals(price, 16.44, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        testMedium.setToppings(toppings);
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 18.44, .01);

        Pepperoni testLarge = new Pepperoni("large");
        testLarge.setToppings(toppings);
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 20.44, .01);
    }

    /**
     * Test for calculating price with 7 toppings for each pizza size.
     */
    @Test
    public void testSevenToppings() {
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.ONION);
        toppings.add(Topping.MUSHROOM);
        toppings.add(Topping.CHICKEN);
        toppings.add(Topping.PINEAPPLE);
        toppings.add(Topping.HAM);
        toppings.add(Topping.OLIVES);
        toppings.add(Topping.PEPPERONI);

        Pepperoni testSmall = new Pepperoni("small");
        testSmall.setToppings(toppings);
        double price = testSmall.getprice();
        assertEquals(price, 17.93, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        testMedium.setToppings(toppings);
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 19.93, .01);

        Pepperoni testLarge = new Pepperoni("large");
        testLarge.setToppings(toppings);
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 21.93, .01);
    }
    /**
     * Test for calculating price with 8 toppings for each pizza size.
     * This should be the same as 7 toppings becuase we can't have more
     * than 7 toppings.
     */
    @Test
    public void testEightToppings() {
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.ONION);
        toppings.add(Topping.MUSHROOM);
        toppings.add(Topping.CHICKEN);
        toppings.add(Topping.PINEAPPLE);
        toppings.add(Topping.HAM);
        toppings.add(Topping.OLIVES);
        toppings.add(Topping.PEPPERONI);
        //toppings.add(Topping.ONION);

        Pepperoni testSmall = new Pepperoni("small");
        testSmall.setToppings(toppings);
        double price = testSmall.getprice();
        System.out.println(price);
        assertEquals(price, 17.93, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        testMedium.setToppings(toppings);
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 19.93, .01);

        Pepperoni testLarge = new Pepperoni("large");
        testLarge.setToppings(toppings);
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 21.93, .01);
    }
    /**
     * Test for calculating price with all possible toppings for each pizza size.
     * This should be the same price as 7 toppings becuase we can't have more
     * than 7 toppings.
     */
    @Test
    public void testAllToppings() {
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.ONION);
        toppings.add(Topping.MUSHROOM);
        toppings.add(Topping.CHICKEN);
        toppings.add(Topping.PINEAPPLE);
        toppings.add(Topping.HAM);
        toppings.add(Topping.OLIVES);
        toppings.add(Topping.PEPPERONI);


        Pepperoni testSmall = new Pepperoni("small");
        testSmall.setToppings(toppings);
        double price = testSmall.getprice();
        System.out.println(price);
        assertEquals(price, 17.93, .01);

        Pepperoni testMedium = new Pepperoni("medium");
        testMedium.setToppings(toppings);
        double priceMedium = testMedium.getprice();
        assertEquals(priceMedium, 19.93, .01);

        Pepperoni testLarge = new Pepperoni("large");
        testLarge.setToppings(toppings);
        double priceLarge = testLarge.getprice();
        assertEquals(priceLarge, 21.93, .01);
    }
}

