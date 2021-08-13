package Basket;

import java.util.HashMap;
import java.util.Map;

public class Basket {


    private Map<Item, Integer> orderedItems = new HashMap<>();

    public Basket(Map<Item, Integer> orderedItems){
        this.orderedItems = orderedItems;
    }

    public void addItem(Item item, Integer i){

        if (i instanceof Integer) {
            if (i > 0) {
                getOrderedItems().put(item, i);
            } else {
                throw new IllegalArgumentException("Amount cannot be less or equal to zero!");
            }
        }
        else {
            throw new IllegalArgumentException("Please provide a number");
        }
    }



    public void removeItems(Item item, Integer i){
        Integer currentAmount = orderedItems.get(item);

        if(i instanceof Integer){
            if ( i > 0){
                if (currentAmount == i){
                    orderedItems.remove(item);
                }
                else {
                    Integer newAmount = currentAmount - i;
                    orderedItems.put(item, newAmount);
                }
            }else{
                throw new IllegalArgumentException("Amount cannot be less or equal to zero!");
            }
        }
        else {
            throw new IllegalArgumentException("Please provide a number");
        }

    }



    public double summarizedOrderValueCounter(Map<Item, Integer> orderedItems){

        if (orderedItems.isEmpty() == true){
            throw new NullPointerException("Koszyk pusty");
        }
        else {
            double summarizedOrderValue = 0;
            Item key;
            Integer i;
            double unitPrice;
            for (Map.Entry<Item, Integer> entry : orderedItems.entrySet()) {
                key = entry.getKey();
                i = entry.getValue();
                unitPrice = key.getPrice();
                summarizedOrderValue = summarizedOrderValue + unitPrice * i;
            }
            return summarizedOrderValue;
        }
    }

    public Map<Item, Integer> getOrderedItems() {
        return orderedItems;
    }
}
