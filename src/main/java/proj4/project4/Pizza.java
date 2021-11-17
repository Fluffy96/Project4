package proj4.project4;

import java.util.ArrayList;
//import  proj4.project4.Topping;

public abstract class Pizza {
    protected ArrayList<Topping> toppings = new ArrayList<Topping>();
    protected Size size;
    //public enum Topping {PEPPERONI, HAM, PINEAPPLE, OLIVES, CHICKEN, MUSHROOM, ONION};
    /*public enum Size {
        SMALL(0.00), MEDIUM(2.00), LARGE(4.00);
        private double price;
        Size(double price){
            this.price = price;
        }
        public double getPrice(){
            return this.price;
        }
    };*/
    public static final double PERTOPPING = 1.49;
    public static final int NOTFOUND = -1;
    public double pizzaPrice = 0;

    public abstract double getprice();

    public abstract void setprice(double cost);

    public abstract void addTopping(Topping top); //returns a string that says yes if it is able to return

    public abstract void removeTopping(Topping top);

    public abstract void setToppings(ArrayList<Topping> tops);

    public abstract ArrayList<Topping> unusedToppings();

    public abstract String[] getTopppings();

    public abstract int getMinTop();

    public abstract void changeSize(String s);

}
