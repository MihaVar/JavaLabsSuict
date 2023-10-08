package org.example;

import org.example.Item;

import java.util.ArrayList;

public interface IManageble {
    boolean addItem(Item i);
    Item removeItem(Item i);
    ArrayList<Item> borrowedList();
    ArrayList<Item> availableList();
}