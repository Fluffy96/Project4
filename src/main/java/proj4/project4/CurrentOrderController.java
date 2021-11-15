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
        double cost =0.0;
        ArrayList<Pizza> list  = cust.getPizza(num);
        for(int i =0; i< list.size(); i++){
            currOrders.add(list.get(i).toString());
            cost = cost + list.get(i).getprice();
        }
        double tax = cost * TAX;
        double total = tax +cost;
        subtotal.setText(df.format(cost));
        currentOrderTotal.setText((df.format(total)));
        salestax.setText(df.format(tax));
        currentOrderListView.setItems(currOrders);


    }

    @FXML
    protected void onRemovePizza(){
        salestax.setText("HI 45678");
        System.out.println("HEREREr");

    }
    @FXML
    protected void onPlaceOrder(){

    }

}
