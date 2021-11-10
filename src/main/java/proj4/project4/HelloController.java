package proj4.project4;

import javafx.fxml.FXML;
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
        cNum.setText("D");
    }
    @FXML
    protected void onHawaiianClick() {
        cNum.setText("H");
    }
    @FXML
    protected void onPepperoniClick() {
        cNum.setText("P");
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