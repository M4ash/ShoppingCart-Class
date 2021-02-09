/**
* @author Billah Syed Mashkur
* OBJECTS & CLASSES
*/

import java.util.Scanner;
public class ShoppingCart {
    //class representation
    private int itemCount;
    private String[] items = new String[20];
    private int itemRemoved = 0;
    Scanner in = new Scanner(System.in);
    public ShoppingCart() {
    }
    public ShoppingCart(String[] items) {
    this.items = items;
    }

    //methods..
    public void addToCart(String newItem) {
    itemCount++;
    String[] newItems = new String[itemCount];
    for(int i = 0; i < itemCount-1; i++) {
        newItems[i] = items[i];
    }
    newItems[itemCount-1] = newItem;
    items = newItems;
    }

    public void DropFromCart(String dropItem) {
    String[] temp = items;
    for(int i = 0; i < items.length; i++) {
        if(items[i].equals(dropItem)) {
            for(int j =i; j < items.length-1; j++) {
                temp[j] = items[j+1];
            }
            String[] newItems = new String[items.length-1];
            for(int k = 0; k < items.length-1; k++) {
                newItems[k] = temp[k];
            }
            items = newItems;
        }
    }
    itemRemoved++;
    itemCount--;
    }

    public void getItems() {
        System.out.print("List of items : ");
        for(int i=0; i < items.length; i++) {
            System.out.print(items[i] +", ");
        }
        System.out.print("\n");
    }
    
    public int getNoOfItems() {
        return itemCount;
    }
}

