package edu.uaslp.objetos.shoppingcart;

import java.util.LinkedList;
import java.util.stream.Stream;

public class ShoppingCart {
    private LinkedList<ShoppingItem> shoppingCart;
    private ShoppingItemCatalog catalog;

    public ShoppingCart(ShoppingItemCatalog catalog){
         shoppingCart = new LinkedList<>();
        this.catalog = catalog;
    }
    public void add(String code){
        ShoppingItem item = catalog.getItem(code);
        shoppingCart.add(item);
    }
    public int getTotalCostInCents(){
        int cost=0;
        for(ShoppingItem item : shoppingCart)
            cost+= item.getUnitCostInCents();
        return cost;
    }
    public int getDistinctItemsCount(){
        int count=0;
        LinkedList<ShoppingItem> list = getDistinctItems();
        count = list.size();
        return count;
    }
    public int getTotalItemsCount(){
        return shoppingCart.size();
    }
    public LinkedList<ShoppingItem> getItems(){
        return shoppingCart;
    }
    public LinkedList<ShoppingItem> getDistinctItems(){
        LinkedList<ShoppingItem> collection = new LinkedList<>();
        for(ShoppingItem item : shoppingCart) {
            if (!(collection.contains(item)))
                collection.add(item);
        }
        return collection;
    }
}
