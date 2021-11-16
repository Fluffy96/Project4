package proj4.project4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Pepperoni extends Pizza{

    public static final double BASEPRICE = 8.99;
    public static final int MINTOPPINGS = 1;
    public static final DecimalFormat df = new DecimalFormat("#.##");

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
    public ArrayList<Topping> unusedToppings() {
        ArrayList<Topping> out = new ArrayList<>();
        for(Topping t: Topping.values()){
            out.add(t);
            if(toppings.contains(t)){
                out.remove(t);
            }
        }
        return out;
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
        String out = "Pepperoni Pizza, ";
        for(Topping top: toppings){
            out += top.toString()+", ";
        }
        out += size.toString()+", ";
        out += "$ ";
        out += df.format(pizzaPrice);
        return out;
    }

}

