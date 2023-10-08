package org.example;

import java.util.ArrayList;

public class Library{
    private final ArrayList<Item> items = new ArrayList<>();


    public ArrayList<Item> getItems() {
        return items;
    }


    public boolean addItem(Item i) {
        for (Item item : items) {
            if(item.getUniqueID().equals(i.getUniqueID())){
                printer("Item already exist");
                return false;
            }
        }
        printer("Item added");
        return items.add(i);
    }


    public Item removeItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if(item.getUniqueID().equals(items.get(i).getUniqueID())){
                printer("Item removed");
                return items.remove(i);
            }
        }
        printer("Item does not exist");
        return null;
    }



    public ArrayList<Item> listAvailable() {
        ArrayList<Item> listAvailable = new ArrayList<>();
        for (Item i : items) {
            listAvailable.add(i);
        }
        if(listAvailable.size() != 0) {
            printer("List of available items:\n" + listAvailable);
            return listAvailable;
        }
        printer("No available items");
        return null;
    }

    private void printer(String message) {
        System.out.println(message);
        System.out.println(" ");
    }
}
