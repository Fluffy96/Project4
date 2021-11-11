package proj4.project4;

import java.util.ArrayList;

public class Hawaiian extends Pizza{

    public static final double BASEPRICE = 10.99;

    Hawaiian(String pSize){
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
        toppings.add(Topping.PINEAPPLE);
        toppings.add(Topping.HAM);
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
