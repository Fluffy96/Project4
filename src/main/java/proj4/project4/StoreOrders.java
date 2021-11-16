package proj4.project4;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class StoreOrders {

    private static ArrayList<ObservableList<Orders>> finalOrders = new ArrayList<>();
    private static ArrayList<Double> totalPrices = new ArrayList<>();
    private static ArrayList<Orders> orders = new ArrayList<>();
    private static ArrayList<String> phoneNumberList = new ArrayList<>();
    private static String currentNumber;

    public StoreOrders(){

    }

    public void addOrders( Orders order){
        orders.add(order);
    }

    public void addTP(double totPrice){
        totalPrices.add(totPrice);
    }
    public  ArrayList<Orders> getOrders() {
        return orders;
    }

    public  ArrayList<ObservableList<Orders>> getFinalOrders() {
        return finalOrders;
    }

    public  ArrayList<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void addPhoneNumbers (String num){
        phoneNumberList.add(num);
    }

    public  ArrayList<Double> getTotalPrices() {
        return totalPrices;
    }

    public  String getCurrentNumber() {
        return currentNumber;
    }

    public  void setCurrentNumber(String currentNumber) {
        StoreOrders.currentNumber = currentNumber;
    }

    @Override
    public String toString(){
        return null;
    }

    public void addOrder(Orders order){

    }

    public void export(){

    }

}
