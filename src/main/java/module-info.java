module proj4.project4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens proj4.project4 to javafx.fxml;
    exports proj4.project4;
}