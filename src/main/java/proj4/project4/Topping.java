package proj4.project4;

import java.util.Locale;

public enum Topping {
    PEPPERONI, HAM, PINEAPPLE, OLIVES, CHICKEN, MUSHROOM, ONION;

    public static Topping toTopping(String top){
        switch (top.toLowerCase()){
            case "pepperoni":
                return Topping.PEPPERONI;
            case "ham":
                return Topping.HAM;
            case "pineapple":
                return Topping.PINEAPPLE;
            case "olives":
                return Topping.OLIVES;
            case "chicken":
                return Topping.CHICKEN;
            case "mushroom":
                return Topping.MUSHROOM;
            case "onion":
                return Topping.ONION;
            default:
                return null;
        }
    }
}
