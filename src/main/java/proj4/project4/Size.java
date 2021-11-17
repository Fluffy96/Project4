/**
 * This class is an Enum that has the 3 different sizes of pizza

 * @author Divyesh Nemam Baskaran, Viraj Patel
 *
 */

package proj4.project4;

public enum Size {
    SMALL(0.00), MEDIUM(2.00), LARGE(4.00);

    private double price;

    Size(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
