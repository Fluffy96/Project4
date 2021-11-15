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
    private ObservableList<String> items = FXCollections.observableArrayList ();
    @FXML
    private ListView<String> deluxeAdditional ;
    @FXML
    private TextField cNum;

    @FXML
    private void setDeluxeAdditional(){
        items.addAll("Single", "Double", "Suite", "Family App");
        deluxeAdditional.setItems(items);


    }

}
