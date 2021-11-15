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
        if(index > pizzaList.size()-1){
            ArrayList<Pizza> npiz = new ArrayList<>();
            npiz.add(piz);
            pizzaList.add(npiz);
        }else{
            pizzaList.remove(index);
            ArrayList<Pizza> npiz = getPizza(pNum);
            npiz.add(piz);
            pizzaList.add(index,npiz);

        }

    }
    public ArrayList<Pizza> getPizza(int pNum){
        int index = phoneNumbers.indexOf(pNum);
        ArrayList <Pizza> list = pizzaList.get(index);
        return list;
    }
    public void removePizza(int pNum,Pizza piz){
        ArrayList<Pizza> npiz = getPizza(pNum);
        int index = phoneNumbers.indexOf(pNum);
        npiz.remove(piz);
        pizzaList.remove(index);
        if(npiz.size() != 0){
            pizzaList.add(index,npiz);
        }
    }


}
