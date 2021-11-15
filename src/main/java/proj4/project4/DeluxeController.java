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
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class DeluxeController {
    private ObservableList<String> selectTopping = FXCollections.observableArrayList ();
    private ObservableList<String> additionalTopping = FXCollections.observableArrayList ();
    @FXML
    private ListView<String> deluxeAdditional,deluxeToppings ;
    @FXML
    private MenuButton isSizeSelect;
    @FXML
    private TextField deluxePrice;
    private Customer customer = new Customer();
    private int phoneNumber;
    private Deluxe initialSmallPizza;
    private DecimalFormat df = new DecimalFormat("#.##");
    private final int MINIMUMTOPPINGS = 5;

    /**
     * Method allows us to pass phonenumber and customer object from hello controller; It sets the initial pizza at size small with deluxe toppings
     * @param num
     * @param cust
     */
    public void setCustomerAndNumber(int num, Customer cust){
        deluxePrice.setEditable(false);
        phoneNumber = num;
        customer = cust;
        initialSmallPizza = new Deluxe("Small");
        deluxeToppings.getItems().clear();
        deluxeAdditional.getItems().clear();
        selectTopping.addAll(initialSmallPizza.getTopppings());
        deluxeToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        deluxeAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        deluxePrice.setText(String.valueOf(initialSmallPizza.getprice()));
    }

    @FXML
    private void setDeluxeAdditional(){


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
        String selected = deluxeAdditional.getSelectionModel().getSelectedItem();
        if(deluxeAdditional.getItems().size()!=0 && selected!=null) {
            ObservableList<String> items = deluxeToppings.getItems();
            int len = items.size();
            if (!items.contains(selected) && len <= 7) {
                deluxeToppings.getItems().add(selected);
                initialSmallPizza.addTopping(Topping.toTopping(selected));
                deluxePrice.setText(df.format(initialSmallPizza.getprice()));
            }
            items = deluxeAdditional.getItems();
            len = items.size();
            if (items.contains(selected) && len > 0) {
                deluxeAdditional.getItems().remove(selected);
            }
        }
    }
    @FXML
    protected void onRemoveTopping(){
        String selected = deluxeToppings.getSelectionModel().getSelectedItem();
        if( selected!=null) {
            ObservableList<String> items = deluxeToppings.getItems();
            int len = items.size();
            if (items.contains(selected) && len > MINIMUMTOPPINGS) {
                deluxeToppings.getItems().remove(selected);
                initialSmallPizza.removeTopping(Topping.toTopping(selected));
                deluxePrice.setText(df.format(initialSmallPizza.getprice()));
            }
            items = deluxeAdditional.getItems();
            if (!items.contains(selected) && len > MINIMUMTOPPINGS) {
                deluxeAdditional.getItems().add(selected);
            }
        }
    }



    /**
     * Method makes it so when the small pizza size is chosen price and pizza update to that of original deluxe pizza
     */
    @FXML
    private void setSmall(){
        deluxeToppings.getItems().clear();
        deluxeAdditional.getItems().clear();
        initialSmallPizza = new Deluxe("Small");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        deluxeToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        deluxeAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        deluxePrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the medium pizza size is chosen price and pizza update to that of original deluxe pizza
     */
    @FXML
    private void setMedium(){
        deluxeToppings.getItems().clear();
        deluxeAdditional.getItems().clear();
        initialSmallPizza = new Deluxe("Medium");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        deluxeToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        deluxeAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Medium");
        deluxePrice.setText(df.format(initialSmallPizza.getprice()));
    }

    /**
     * Method makes it so when the large pizza size is chosen price and pizza update to that of original deluxe pizza
     */
    @FXML
    private void setLarge(){
        deluxeToppings.getItems().clear();
        deluxeAdditional.getItems().clear();
        initialSmallPizza = new Deluxe("Large");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        deluxeToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        deluxeAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Large");
        deluxePrice.setText(df.format(initialSmallPizza.getprice()));
    }

}
