package proj4.project4;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ArrayList<Pizza>> pizzaList = new ArrayList<>();
    private ArrayList<Integer> phoneNumbers = new ArrayList<>();
    private ArrayList<Boolean> orderPlace = new ArrayList<>();
    private static final int SIZE_CORRECTION = -1;
    private static final int NO_LENGTH =0;
    public Customer(){

    }
    public void newCustomer(int pNum){
        phoneNumbers.add(pNum);
        orderPlace.add(false);
    }

    public void addPiza(int pNum, Pizza piz){
        int index = phoneNumbers.indexOf(pNum);
        if(index > pizzaList.size()+SIZE_CORRECTION){
            ArrayList<Pizza> npiz = new ArrayList<>();
            npiz.add(piz);
            pizzaList.add(npiz);
        }else{
            ArrayList<Pizza> npiz = getPizza(pNum);
            pizzaList.remove(index);
            npiz.add(piz);
            pizzaList.add(index,npiz);

        }

    }
    public ArrayList<Pizza> getPizza(int pNum){
        int index = phoneNumbers.indexOf(pNum);
        try {
            ArrayList<Pizza> list = pizzaList.get(index);
            return list;
        }catch(IndexOutOfBoundsException e){
            return(null);
        }
    }
    public void removePizza(int pNum,int indexOfPizza){
        ArrayList<Pizza> npiz = getPizza(pNum);
        int index = phoneNumbers.indexOf(pNum);
        npiz.remove(indexOfPizza);
        pizzaList.remove(index);
        if(npiz.size() != NO_LENGTH){
            pizzaList.add(index,npiz);
        }
    }

    public void addOrder(int pNum ){
        int index = phoneNumbers.indexOf(pNum);
        orderPlace.remove(index);
        orderPlace.add(index,true);

    }

}
