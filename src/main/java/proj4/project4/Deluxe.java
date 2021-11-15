package proj4.project4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Deluxe extends Pizza{

    public static final double BASEPRICE = 12.99;
    public static final int MINTOPPINGS = 5;
    public static final DecimalFormat df = new DecimalFormat("#.##");

    Deluxe(String pSize){
        if(pSize.toLowerCase().equals( "small")){
            size = Size.SMALL;
            double amount = BASEPRICE+size.getPrice();
            setprice(amount);
        }else if(pSize.toLowerCase().equals("medium")){
            size = Size.MEDIUM;
            double amount = BASEPRICE+size.getPrice();
            setprice(amount);
        }else{
            size = Size.LARGE;
            double amount = BASEPRICE+size.getPrice();
            setprice(amount);
        }
        Topping[] otherList = new Topping[] {Topping.MUSHROOM, Topping.CHICKEN, Topping.OLIVES, Topping.ONION, Topping.PEPPERONI};
        toppings.addAll(Arrays.asList(otherList));

    }
    @Override
    public double getprice() {
        double amount = BASEPRICE+size.getPrice();
        if(toppings.size()>MINTOPPINGS){
            amount += (toppings.size()-MINTOPPINGS)*PERTOPPING;
        }
        setprice(amount);
        return pizzaPrice;
    }

    @Override
    public void setprice(double cost) {
        pizzaPrice = cost;
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

    @Override
    public String toString(){
        String out = "Deluxe Pizza, ";
        for(Topping top: toppings){
            out += top.toString()+", ";
        }
        out += "$ ";
        out += df.format(pizzaPrice);
        return out;
    }

}
