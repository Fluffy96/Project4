package proj4.project4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button hell;
    @FXML
    private TextField cNum;


    @FXML
    protected void onHelloButtonClick() {
        cNum.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onDeluxeClick() {
        try {
            int result = Integer.parseInt(cNum.getText());
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
        cNum.setText("P");
    }
    @FXML
    protected void onStoreOrderClick() {
        cNum.setText("P");
    }

}