package proj4.project4;

import java.util.Arrays;
import java.util.Locale;

public class Pepperoni extends Pizza{

    public static final double BASEPRICE = 8.99;

    Pepperoni(String pSize){
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
        toppings.add(Topping.PEPPERONI);
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

