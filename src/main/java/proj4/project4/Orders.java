package proj4.project4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Orders {
    private String phoneNum;
    private ArrayList<Pizza> pizzaList = new ArrayList<>();
    private double price;
    private DecimalFormat df = new DecimalFormat("#.##");
    public Orders(String phoneNu){
        phoneNum = phoneNu;
    }
    public Orders(){
    }
    public void addPizza(Pizza piz, double pric){
        pizzaList.add(piz);
        price = price + pric;
    }
    public  ArrayList<Pizza> getPizzaList(){
        if(pizzaList.size() != -1){
            return pizzaList;
        }else{
            return null;
        }
    }
    public double getPrice(){
        return price;
    }
    public void removePizza(Pizza piz){
        pizzaList.remove(piz);
    }
    public String getPhoneNum(){
        return phoneNum;
    }


}
