package proj4.project4;

import java.util.ArrayList;

public abstract class Pizza {
    protected ArrayList<Topping> toppings = new ArrayList<Topping>();
    protected Size size;
    public enum Topping {PEPPERONI, HAM, PINEAPPLE, OLIVES, CHICKEN, MUSHROOM, ONION};
    public enum Size {
        SMALL(0.00), MEDIUM(2.00), LARGE(4.00);
        private double price;
        Size(double price){
            this.price = price;
        }
        public double getPrice(){
            return this.price;
        }
    };
    //public static final double SMALLPRICE = 0.00, MEDIUMPRICE = 2.00, LARGEPRICE = 4.00;
    public static final double PERTOPPING = 1.49;

    public abstract double price();

    /*private double addSizePrice(){
        if(size == Size.SMALL){
            return SMALLPRICE;
        }
        if(size == Size.MEDIUM){
            return MEDIUMPRICE;
        }
        if(size == Size.LARGE){
            return LARGEPRICE;
        }
        else return 0;
    }*/
}
