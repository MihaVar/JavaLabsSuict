package org.example;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("Witcher: Last Wish", "Andrzei Sapkowsky");
        Book book2 = new Book("Call of Ctulhu", "Howard H.P. Lovecraft");
        Book book3 = new Book("Kobzar", "Taras Shevchenko");
        DVD dvd1 = new DVD("Star Wars: Return of a Jedi", 134);
        DVD dvd2 = new DVD("Fight Club", 139);

        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(book3);
        lib.addItem(book1);
        lib.addItem(dvd1);
        lib.addItem(dvd2);
        lib.addItem(dvd2);

        lib.listAvailable();

        lib.removeItem(book1);
        lib.removeItem(book3);

        lib.listAvailable();
    }
}