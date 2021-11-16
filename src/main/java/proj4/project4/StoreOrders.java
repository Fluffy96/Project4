package proj4.project4;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class StoreOrders {

    private static ArrayList<ObservableList<Orders>> finalOrders;
    private static ArrayList<Double> totalPrices;
    private static ArrayList<Orders> orders;
    private static ObservableList<String> phoneNumberList;
    private static String currentNumber;

    public static ArrayList<Orders> getOrders() {
        return orders;
    }

    public static ArrayList<ObservableList<Orders>> getFinalOrders() {
        return finalOrders;
    }

    public static ObservableList<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    public static ArrayList<Double> getTotalPrices() {
        return totalPrices;
    }

    public static String getCurrentNumber() {
        return currentNumber;
    }

    public static void setCurrentNumber(String currentNumber) {
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
