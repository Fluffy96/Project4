package proj4.project4;
/**
 * This class is the UI that contains the run function to interract with album collections

 * @author Divyesh Nemam Baskaran, Viraj Patel
 *
 */

/**
 * Method for size object
 */
public enum Size {
    SMALL(0.00), MEDIUM(2.00), LARGE(4.00);

    private double price;

    /**
     * Sets
     * @param price
     */
    Size(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
