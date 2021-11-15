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

    }
    @FXML
    protected void onSelectSize(){

    }
    @FXML
    protected void onAddTopping(){
        String selected = deluxeAdditional.getSelectionModel().getSelectedItem();
        ObservableList<String> items = deluxeToppings.getItems();
        int len = items.size();
        if(!items.contains(selected) && len <= 7){
            deluxeToppings.getItems().add(selected);
        }
        items = deluxeAdditional.getItems();
        len = items.size();
        if(items.contains(selected) && len > 0){
            deluxeAdditional.getItems().remove(selected);
        }
    }
    @FXML
    protected void onRemoveTopping(){
        String selected = deluxeToppings.getSelectionModel().getSelectedItem();
        ObservableList<String> items = deluxeToppings.getItems();
        int len = items.size();
        if(items.contains(selected) && len > MINIMUMTOPPINGS){
            deluxeToppings.getItems().remove(selected);
        }
        items = deluxeAdditional.getItems();
        if(!items.contains(selected) && len > MINIMUMTOPPINGS){
            deluxeAdditional.getItems().add(selected);
        }
    }
    /*private boolean alreadyAddedCheck(ListView lv, String s){
        boolean out = false;
        ObservableList<String> items = lv.getItems();

    }*/
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
