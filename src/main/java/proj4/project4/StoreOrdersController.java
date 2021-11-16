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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class StoreOrdersController {
    @FXML
    private MenuButton storeOrderPhoneNumber;

    public void setCustomerAndNumber(StoreOrders store){
        ArrayList<String> numbers = store.getPhoneNumberList();
        for(int i =0; i<numbers.size();i++){
            MenuItem m1 = new MenuItem((numbers.get(i)));
            storeOrderPhoneNumber.getItems().add(m1);
        }
    }





    @FXML
    protected void onCancelOrder(){

    }
    @FXML
    protected void onExportStoreOrders(){

    }

}
