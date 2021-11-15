package proj4.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Objects;

public class HawaiianController {
    private ObservableList<String> selectTopping = FXCollections.observableArrayList ();
    private ObservableList<String> additionalTopping = FXCollections.observableArrayList ();
    @FXML
    private ListView<String> hawaiianAdditional,hawaiianToppings ;
    @FXML
    private MenuButton isSizeSelect;
    @FXML
    private TextField hawaiinPrice;
    private Customer customer = new Customer();
    private int phoneNumber;
    private Hawaiian initialSmallPizza;
    private DecimalFormat df = new DecimalFormat("#.##");

    /**
     * Method allows us to pass phonenumber and customer object from hello controller; It sets the initial pizza at size small with hawaiin toppings
     * @param num
     * @param cust
     */
    public void setCustomerAndNumber(int num, Customer cust){
        hawaiinPrice.setEditable(false);
        phoneNumber = num;
        customer = cust;
        initialSmallPizza = new Hawaiian("Small");
        hawaiianToppings.getItems().clear();
        hawaiianAdditional.getItems().clear();
        selectTopping.addAll(initialSmallPizza.getTopppings());
        hawaiianToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.PEPPERONI.toString());
        hawaiianAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        hawaiinPrice.setText(String.valueOf(initialSmallPizza.getprice()));
    }

    @FXML
    protected void onHawaiianAdd(){

    }

    /**
     * Method makes it so when the small pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setSmall(){
        hawaiianToppings.getItems().clear();
        hawaiianAdditional.getItems().clear();
        initialSmallPizza = new Hawaiian("Small");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        hawaiianToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.PEPPERONI.toString());
        hawaiianAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        hawaiinPrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the medium pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setMedium(){
        hawaiianToppings.getItems().clear();
        hawaiianAdditional.getItems().clear();
        initialSmallPizza = new Hawaiian("Medium");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        hawaiianToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.PEPPERONI.toString());
        hawaiianAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Medium");
        hawaiinPrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the large pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setLarge(){
        hawaiianToppings.getItems().clear();
        hawaiianAdditional.getItems().clear();
        initialSmallPizza = new Hawaiian("Large");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        hawaiianToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.PEPPERONI.toString());
        hawaiianAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Large");
        hawaiinPrice.setText(df.format(initialSmallPizza.getprice()));
    }
}
