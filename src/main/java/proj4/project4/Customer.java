package proj4.project4;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ArrayList<Pizza>> pizzaList = new ArrayList<>();
    private ArrayList<Integer> phoneNumbers = new ArrayList<>();

    public Customer(){

    }
    public void newCustomer(int pNum){
        phoneNumbers.add(pNum);
    }

    public void addPiza(int pNum, Pizza piz){
        int index = phoneNumbers.indexOf(pNum);
        pizzaList.get(index).add(piz);
    }

}
