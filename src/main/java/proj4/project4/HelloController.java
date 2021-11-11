package proj4.project4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    private static final int PIZZABUILDWIDTH = 550, PIZZABUILDHEIGHT = 525, CURRENTORDERWIDTH = 600, CURRENTORDERHEIGHT = 400, STOREORDERWIDTH = 600, STOREORDERHEIGHT = 400;
    @FXML
    private TextField cNum;
    @FXML
    private ListView deluxeAdditional, deluxeToppings, pepperoniAdditional, pepperoniToppings, hawaiianAdditional, hawaiianToppings;
    private Customer customer = new Customer();
    private int phoneNumber;


    @FXML
    protected void onDeluxeClick() {
        try {
            int result = Integer.parseInt(cNum.getText());
            Parent root;
            if(cNum.getText().length() == 10) {
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(HelloController.class.getResource("deluxe-view.fxml")));
                    Stage stage = new Stage();
                    stage.setTitle("Customize Your Pizza");
                    stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                    stage.setResizable(false);
                    stage.show();
                    phoneNumber = result;
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
    protected void onHawaiianClick() {
        try {
            int result = Integer.parseInt(cNum.getText());
            Parent root;
            try{
                root = FXMLLoader.load(Objects.requireNonNull(HelloController.class.getResource("hawaiian-view.fxml")));
                Stage stage = new Stage();
                stage.setTitle("Customize Your Pizza");
                stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                stage.setResizable(false);
                stage.show();
            }catch(IOException e){
                e.printStackTrace();
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
    protected void onPepperoniClick() {
        try {
            int result = Integer.parseInt(cNum.getText());
            Parent root;
            try{
                root = FXMLLoader.load(Objects.requireNonNull(HelloController.class.getResource("pepperoni-view.fxml")));
                Stage stage = new Stage();
                stage.setTitle("Customize Your Pizza");
                stage.setScene(new Scene(root, PIZZABUILDWIDTH, PIZZABUILDHEIGHT));
                stage.setResizable(false);
                stage.show();
            }catch(IOException e){
                e.printStackTrace();
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
    protected void onCurrentOrderClick() {
        Parent root;
        try{
            root = FXMLLoader.load(Objects.requireNonNull(HelloController.class.getResource("currentorder-view.fxml")));
            Stage stage = new Stage();
            stage.setTitle("Customize Your Pizza");
            stage.setScene(new Scene(root, CURRENTORDERWIDTH, CURRENTORDERHEIGHT));
            stage.setResizable(false);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    @FXML
    protected void onStoreOrderClick() {
        Parent root;
        try{
            root = FXMLLoader.load(Objects.requireNonNull(HelloController.class.getResource("storeorders-view.fxml")));
            Stage stage = new Stage();
            stage.setTitle("Customize Your Pizza");
            stage.setScene(new Scene(root, STOREORDERWIDTH, STOREORDERHEIGHT));
            stage.setResizable(false);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    @FXML
    protected void setDeluxeAdditional(){

    }

}