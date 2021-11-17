package proj4.project4;

public enum Topping {
    PEPPERONI, HAM, PINEAPPLE, OLIVES, CHICKEN, MUSHROOM, ONION;

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
