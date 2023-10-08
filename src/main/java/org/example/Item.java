package org.example;

public abstract class Item {
    private String title;
    private String uniqueID;

    public Item(String title) {
        this.title = title;
        uniqueID = idGenerator();
    }

    public String getTitle() {
        return title;
    }


    public String getUniqueID() {
        return uniqueID;
    }

    abstract String idGenerator();
}
