package proj4.project4;

import java.util.Arrays;

public class Deluxe extends Pizza{

    public static final double BASEPRICE = 12.99;
    private double price;

    Deluxe(String pSize){
        if(pSize.toLowerCase().equals( "small")){
            size = Size.SMALL;
            setprice(BASEPRICE+size.getPrice());
        }else if(pSize.toLowerCase().equals("medium")){
            size = Size.MEDIUM;
            setprice(BASEPRICE+size.getPrice());
        }else{
            size = Size.LARGE;
            setprice(BASEPRICE+size.getPrice());
        }
        Topping[] otherList = new Topping[] {Topping.MUSHROOM, Topping.CHICKEN, Topping.OLIVES, Topping.ONION, Topping.PEPPERONI};
        toppings.addAll(Arrays.asList(otherList));
    }
    @Override
    public double getprice() {
        return pizzaPrice;
    }

    @Override
    public void setprice(double cost) {
        pizzaPrice = pizzaPrice + cost;
    }

    @Override
    public void addTopping(Topping top){
        toppings.add(top);
    }

    @Override
    public void removeTopping(Topping top){
        toppings.remove(top);
    }

    @Override
    public String[] getTopppings(){
        String[] topList = new String[toppings.size()];
        for(int i = 0; i < toppings.size();i++){
            topList[i] = toppings.get(i).toString();
        }
        return topList;
    }

}
