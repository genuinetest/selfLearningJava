package Basket;

import java.util.Map;

public class PrintBasket {

    public void printBasketItemsWithTotalproductPrice(Basket basket) {

        //za pomocą Map.Entry iteruj po key i value i printuj od razu z ilością i ceną za daną ilość
        // wyprintuj sumaryczną wartość koszyka
        Map<Item, Integer> mapToPrint = basket.getOrderedItems();
        Item key;
        Integer i;
        String unitName;
        double unitPrice;
        for(Map.Entry<Item, Integer> entry: mapToPrint.entrySet()){
            key = entry.getKey();
            i = entry.getValue();
            unitName = key.getName();
            unitPrice = key.getPrice();
            System.out.println("Nazwa produktu: " + unitName + ", ilość: " + i + ", łączna cena: " + i*unitPrice);

        }
    }

    public void printTotalPrice(Basket basket){
        double totalValue = basket.summarizedOrderValueCounter(basket.getOrderedItems());
        System.out.println(totalValue);
    }

}
