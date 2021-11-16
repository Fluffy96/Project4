package proj4.project4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Orders {
    private String phoneNum;
    private ArrayList<Pizza> pizzaList;
    private double price;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Orders(String phoneNum){
        phoneNum = phoneNum;
    }
    public void addPizza(Pizza piz, double price){
        pizzaList.add(piz);
        price = price;
    }
    public double getPrice(){
        return price;
    }
    public void removePizza(Pizza piz){
        pizzaList.remove(piz);
    }


}
