package proj4.project4;
/**
 * This class is the UI that contains the run function to interract with album collections

 * @author Divyesh Nemam Baskaran, Viraj Patel
 *
 */

/**
 * Creates object of type Topping
 */
public enum Topping {
    PEPPERONI, HAM, PINEAPPLE, OLIVES, CHICKEN, MUSHROOM, ONION;

    /**
     * Method takes in string of the topping and returns the topping object of the topping
     * @param top
     * @return Topping
     */
    public static Topping toTopping(String top){
        return switch (top.toLowerCase()) {
            case "pepperoni" -> Topping.PEPPERONI;
            case "ham" -> Topping.HAM;
            case "pineapple" -> Topping.PINEAPPLE;
            case "olives" -> Topping.OLIVES;
            case "chicken" -> Topping.CHICKEN;
            case "mushroom" -> Topping.MUSHROOM;
            case "onion" -> Topping.ONION;
            default -> null;
        };
    }
}
