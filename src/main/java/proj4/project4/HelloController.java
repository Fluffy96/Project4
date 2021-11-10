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
}