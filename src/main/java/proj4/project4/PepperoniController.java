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

public class PepperoniController {
    private ObservableList<String> selectTopping = FXCollections.observableArrayList ();
    private ObservableList<String> additionalTopping = FXCollections.observableArrayList ();
    @FXML
    private ListView<String> pepperoniAdditional,pepperoniToppings ;
    @FXML
    private MenuButton isSizeSelect;
    @FXML
    private TextField pepperoniPrice;
    private Customer customer = new Customer();
    private int phoneNumber;
    private Pepperoni initialSmallPizza;
    private DecimalFormat df = new DecimalFormat("#.##");
    private final int MINIMUMTOPPINGS = 1;

    public void setCustomerAndNumber(int num, Customer cust){
        pepperoniPrice.setEditable(false);
        phoneNumber = num;
        customer = cust;
        initialSmallPizza = new Pepperoni("Small");
        pepperoniToppings.getItems().clear();
        pepperoniAdditional.getItems().clear();
        selectTopping.addAll(initialSmallPizza.getTopppings());
        pepperoniToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        pepperoniAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        pepperoniPrice.setText(String.valueOf(initialSmallPizza.getprice()));
    }

    @FXML
    protected void onAdd(){
        customer.addPiza(phoneNumber, initialSmallPizza);
        //NEED to make scene close!!!
    }
    @FXML
    protected void onSelectSize(){

    }

    @FXML
    protected void onAddTopping(){
        String selected = pepperoniAdditional.getSelectionModel().getSelectedItem();
        if(pepperoniAdditional.getItems().size()!=0 && selected!=null) {
            ObservableList<String> items = pepperoniToppings.getItems();
            int len = items.size();
            if (!items.contains(selected) && len <= 7) {
                pepperoniToppings.getItems().add(selected);
                initialSmallPizza.addTopping(Topping.toTopping(selected));
                pepperoniPrice.setText(df.format(initialSmallPizza.getprice()));
            }
            items = pepperoniAdditional.getItems();
            len = items.size();
            if (items.contains(selected) && len > 0) {
                pepperoniAdditional.getItems().remove(selected);
            }
        }
    }
    @FXML
    protected void onRemoveTopping(){
        String selected = pepperoniToppings.getSelectionModel().getSelectedItem();
        if( selected!=null) {
            ObservableList<String> items = pepperoniToppings.getItems();
            int len = items.size();
            if (items.contains(selected) && len > MINIMUMTOPPINGS) {
                pepperoniToppings.getItems().remove(selected);
                initialSmallPizza.removeTopping(Topping.toTopping(selected));
                pepperoniPrice.setText(df.format(initialSmallPizza.getprice()));
            }
            items = pepperoniAdditional.getItems();
            if (!items.contains(selected) && len > MINIMUMTOPPINGS) {
                pepperoniAdditional.getItems().add(selected);
            }
        }
    }

    /**
     * Method makes it so when the small pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setSmall(){
        pepperoniToppings.getItems().clear();
        pepperoniAdditional.getItems().clear();
        initialSmallPizza = new Pepperoni("Small");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        pepperoniToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(),Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        pepperoniAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        pepperoniPrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the medium pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setMedium(){
        pepperoniToppings.getItems().clear();
        pepperoniAdditional.getItems().clear();
        initialSmallPizza = new Pepperoni("Medium");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        pepperoniToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        pepperoniAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Medium");
        pepperoniPrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the large pizza size is chosen price and pizza update to that of original hawaiian pizza
     */
    @FXML
    private void setLarge(){
        pepperoniToppings.getItems().clear();
        pepperoniAdditional.getItems().clear();
        initialSmallPizza = new Pepperoni("Large");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        pepperoniToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.MUSHROOM.toString(), Topping.CHICKEN.toString(), Topping.OLIVES.toString(), Topping.ONION.toString(), Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        pepperoniAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Large");
        pepperoniPrice.setText(df.format(initialSmallPizza.getprice()));
    }
}
