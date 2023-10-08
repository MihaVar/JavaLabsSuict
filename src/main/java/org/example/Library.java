package org.example;

import org.example.IManageble;

import java.util.ArrayList;

public class Library implements IManageble {
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Patron> patrons = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean registerPatron(Patron p) {
        if(!patrons.contains(p)) {
            patrons.add(p);
            return true;
        }
        printer("The patron already exists");
        return false;
    }

    public boolean lendItem(Patron p, Item i) {
        if (!i.isBorrowed() && items.contains(i)) {
            i.borrowItem();
            p.borrowItem(i);
            return true;
        }
        printer("Item was borrowed or it's not in the library");
        return false;
    }

    public Item returnItem(Patron p, Item i) {
        if(i.isBorrowed() && p.getBorrowedItems().contains(i) && items.contains(i)) {
            i.returnItem();
            p.returnItem(i);
            return i;
        }
        printer("Item was returned or patron doesn't have this item");
        return null;
    }
    @Override
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

    @Override
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

    @Override
    public ArrayList<Item> borrowedList() {
        ArrayList<Item> listBorrowed = new ArrayList<>();
        for (Item i : items) {
            if(i.isBorrowed()) listBorrowed.add(i);
        }
        if(listBorrowed.size() != 0) {
            printer("List of the borrowed items:\n" + listBorrowed);
            return listBorrowed;
        }
        printer("No borrowed items");
        return null;
    }

    @Override
    public ArrayList<Item> availableList() {
        ArrayList<Item> listAvailable = new ArrayList<>();
        for (Item i : items) {
            if(!i.isBorrowed()) listAvailable.add(i);
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
