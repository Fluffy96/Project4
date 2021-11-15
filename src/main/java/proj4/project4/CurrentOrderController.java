package proj4.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CurrentOrderController {
    private DecimalFormat df = new DecimalFormat("#.##");
    private Customer customer = new Customer();
    private int phoneNumber;
    @FXML
    private TextField currentOrderPhoneNumber,subtotal,currentOrderTotal,salestax;
    private ObservableList<String> currOrders = FXCollections.observableArrayList ();
    @FXML
    private ListView<String> currentOrderListView;
    @FXML
    private Button removePizza;
    private static final double TAX = .06625;
    private static final int NOT_FOUND = -1;
    private static final double NO_COST = 0.0;

    /**
     * Method allows hello controler to pass customer data and current orders phone number
     * @param num
     * @param cust
     */
    public void setCustomerAndNumber(int num, Customer cust){
        currentOrderPhoneNumber.setEditable(false);
        currentOrderPhoneNumber.setText(Integer.toString(num));
        subtotal.setEditable(false);
        currentOrderTotal.setEditable(false);
        salestax.setEditable(false);
        phoneNumber = num;
        customer = cust;
        double cost = NO_COST;

        if(cust.getPizza(num) != null) {
            ArrayList<Pizza> list  = cust.getPizza(num);
            for (int i = 0; i < list.size(); i++) {
                currOrders.add(list.get(i).toString());
                cost = cost + list.get(i).getprice();
            }
            double tax = cost * TAX;
            double total = tax + cost;
            subtotal.setText(df.format(cost));
            currentOrderTotal.setText((df.format(total)));
            salestax.setText(df.format(tax));
            currentOrderListView.setItems(currOrders);
        }else{
            subtotal.setText(String.valueOf(NO_COST));
            salestax.setText(String.valueOf(NO_COST));
            currentOrderTotal.setText(String.valueOf(NO_COST));
        }


    }

    @FXML
    protected void onRemovePizza(){
        int indexPizza = currentOrderListView.getSelectionModel().getSelectedIndex();
        if(indexPizza != NOT_FOUND){
            currentOrderListView.getItems().clear();
            customer.removePizza(phoneNumber,indexPizza);
            double cost = NO_COST;
            ArrayList<Pizza> list  = customer.getPizza(phoneNumber);
            for(int i =0; i< list.size(); i++){
                currOrders.add(list.get(i).toString());
                cost = cost + list.get(i).getprice();
            }
            double tax = cost * TAX;
            double total = tax +cost;
            subtotal.setText(df.format(cost));
            currentOrderTotal.setText((df.format(total)));
            salestax.setText(df.format(tax));
        }

    }

    @FXML
    protected void onPlaceOrder(){

    }

}
