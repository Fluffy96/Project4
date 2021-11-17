package proj4.project4;

import java.util.Locale;

public class PizzaMaker {

    public static Pizza createPizza(String flavor){
        switch (flavor.toLowerCase()){
            case "deluxe":
                return new Deluxe("small");
            case "hawaiian":
                return new Hawaiian("small");
            case "pepperoni":
                return new Pepperoni("small");
            default:
                return new Deluxe("small");
        }
    }
}
