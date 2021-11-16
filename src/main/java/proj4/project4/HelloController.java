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

public class HelloController {

    private static final int PIZZABUILDWIDTH = 550, PIZZABUILDHEIGHT = 525, CURRENTORDERWIDTH = 600, CURRENTORDERHEIGHT = 400, STOREORDERWIDTH = 600, STOREORDERHEIGHT = 400, NUMBERLENGTH =10;
    @FXML
    private TextField cNum;
    @FXML
    private ListView<String> deluxeAdditional, deluxeToppings, pepperoniAdditional, pepperoniToppings, hawaiianAdditional, hawaiianToppings;
    private Orders order;
    private String phoneNumber;


    @FXML
    protected void onDeluxeClick() {
            String result = cNum.getText();
            Parent root;
            if(result.matches("[0-9]+")){
                if(result.length() == NUMBERLENGTH){
                    order = new Orders(result);
                    FXMLLoader Loader = new FXMLLoader();
                    Loader.setLocation(getClass().getResource("deluxe-view.fxml"));
                    try {
                        Loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    DeluxeController deluxe = Loader.getController();
                    deluxe.setCustomerAndNumber(phoneNumber, "deluxe",order);
                    root = Loader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("Customize Your Pizza");
                    stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                    stage.setResizable(false);
                    stage.show();


                }else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning!!");
                    alert.setHeaderText("Phone Number Entered is not 10 Digits");
                    alert.setContentText("Please enter valid Phone Number.");
                    alert.showAndWait();
                }

            }else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!");
                alert.setHeaderText("No Phone Number Entered");
                alert.setContentText("Please enter Phone Number.");
                alert.showAndWait();
            }
        }


    @FXML
    protected void onHawaiianClick() {try {
        String result = cNum.getText();
        Parent root;
        if(result.matches("[0-9]+")){
            if(result.length() == NUMBERLENGTH){
                order = new Orders(result);
                FXMLLoader Loader = new FXMLLoader();
                Loader.setLocation(getClass().getResource("deluxe-view.fxml"));
                Loader.load();
                DeluxeController deluxe = Loader.getController();
                deluxe.setCustomerAndNumber(phoneNumber, "hawaiian",order);
                root = Loader.getRoot();
                Stage stage = new Stage();
                stage.setTitle("Customize Your Pizza");
                stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                stage.setResizable(false);
                stage.show();


            }else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!");
                alert.setHeaderText("Phone Number Entered is not 10 Digits");
                alert.setContentText("Please enter valid Phone Number.");
                alert.showAndWait();
            }

        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!!");
            alert.setHeaderText("No Phone Number Entered");
            alert.setContentText("Please enter Phone Number.");
            alert.showAndWait();
        }
    }
    //Show the error message with a pop-up window.
    catch (NumberFormatException | IOException e) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning!!");
        alert.setHeaderText("No Phone Number Entered");
        alert.setContentText("Please enter Phone Number.");
        alert.showAndWait();

    }
    }
    @FXML
    protected void onPepperoniClick() {
        try {
            String result = cNum.getText();
            Parent root;
            if(result.matches("[0-9]+")){
                if(result.length() == NUMBERLENGTH){
                    order = new Orders(result);
                    FXMLLoader Loader = new FXMLLoader();
                    Loader.setLocation(getClass().getResource("deluxe-view.fxml"));
                    Loader.load();
                    DeluxeController deluxe = Loader.getController();
                    deluxe.setCustomerAndNumber(phoneNumber, "pepperoni",order);
                    root = Loader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("Customize Your Pizza");
                    stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                    stage.setResizable(false);
                    stage.show();


                }else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning!!");
                    alert.setHeaderText("Phone Number Entered is not 10 Digits");
                    alert.setContentText("Please enter valid Phone Number.");
                    alert.showAndWait();
                }

            }else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!");
                alert.setHeaderText("No Phone Number Entered");
                alert.setContentText("Please enter Phone Number.");
                alert.showAndWait();
            }
        }
        //Show the error message with a pop-up window.
        catch (NumberFormatException | IOException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!!");
            alert.setHeaderText("No Phone Number Entered");
            alert.setContentText("Please enter Phone Number.");
            alert.showAndWait();

        }
    }/*
    @FXML
    protected void onCurrentOrderClick() {
        try {
            int result = Integer.parseInt(cNum.getText());
            Parent root;
            if(cNum.getText().length() == 10) {
                try {
                    if(phoneNumber != result) {
                        phoneNumber = result;
                        customer.newCustomer(phoneNumber);
                        FXMLLoader Loader = new FXMLLoader();
                        Loader.setLocation(getClass().getResource("currentorder-view.fxml"));
                        Loader.load();
                        CurrentOrderController deluxe = Loader.getController();
                        deluxe.setCustomerAndNumber(phoneNumber, customer);
                        root = Loader.getRoot();
                        Stage stage = new Stage();
                        stage.setTitle("Current Order");
                        stage.setScene(new Scene(root, CURRENTORDERWIDTH, CURRENTORDERHEIGHT));
                        stage.setResizable(false);
                        stage.show();
                    }else{
                        FXMLLoader Loader = new FXMLLoader();
                        Loader.setLocation(getClass().getResource("currentorder-view.fxml"));
                        Loader.load();
                        CurrentOrderController deluxe = Loader.getController();
                        deluxe.setCustomerAndNumber(phoneNumber, customer);
                        root = Loader.getRoot();
                        Stage stage = new Stage();
                        stage.setTitle("Current Order");
                        stage.setScene(new Scene(root, CURRENTORDERWIDTH, CURRENTORDERHEIGHT));
                        stage.setResizable(false);
                        stage.show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!!");
                alert.setHeaderText("Phone Number Entered is less than 10 Digits");
                alert.setContentText("Please enter valid Phone Number.");
                alert.showAndWait();
            }
    }
    //Show the error message with a pop-up window.
    catch (NumberFormatException e) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning!!");
        alert.setHeaderText("No Phone Number Entered");
        alert.setContentText("Please enter Phone Number.");
        alert.showAndWait();

    }
    }
    @FXML
    protected void onStoreOrderClick() {
        Parent root;
        try{
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("storeorders-view.fxml"));
            Loader.load();
            StoreOrdersController deluxe = Loader.getController();
            deluxe.setCustomerAndNumber(customer);
            root = Loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Current Order");
            stage.setScene(new Scene(root, STOREORDERWIDTH, STOREORDERHEIGHT));
            stage.setResizable(false);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
*/
    }