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
    private void setSmall(){
        deluxeToppings.getItems().clear();
        deluxeAdditional.getItems().clear();
        initialSmallPizza = new Deluxe("Small");
        selectTopping.addAll(initialSmallPizza.getTopppings());
        deluxeToppings.setItems(selectTopping);
        additionalTopping.addAll(Topping.HAM.toString(),Topping.PINEAPPLE.toString());
        deluxeAdditional.setItems(additionalTopping);
        isSizeSelect.setText("Small");
        deluxePrice.setText(String.valueOf(initialSmallPizza.getprice()));
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
        deluxePrice.setText(String.valueOf(initialSmallPizza.getprice()));
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
        deluxePrice.setText(String.valueOf(initialSmallPizza.getprice()));
    }

}
