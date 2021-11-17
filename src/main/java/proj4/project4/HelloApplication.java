/**
 * This class is the main runner class for the JavaFX Application

 * @author Divyesh Nemam Baskaran, Viraj Patel
 *
 */

package proj4.project4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene storeFront = new Scene(fxmlLoader.load(), 625, 650);
        stage.setTitle("RU Pizza Store Front");
        stage.setScene(storeFront);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}