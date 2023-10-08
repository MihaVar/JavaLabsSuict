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

        Patron patron1 = new Patron("Andriy Melnyk");
        Patron patron2 = new Patron("Taras Hrushevsky");
        Patron patron3 = new Patron("Oleksandra Kovalchenko");
        lib.registerPatron(patron1);
        lib.registerPatron(patron2);
        lib.registerPatron(patron3);
        lib.registerPatron(patron3);

        lib.lendItem(patron2, book1);
        lib.lendItem(patron3, book2);
        lib.lendItem(patron1, dvd2);
        lib.lendItem(patron3, dvd2);

        lib.listAvailable();
        lib.listBorrowed();
        lib.listAvailable();

        lib.returnItem(patron2, book1);
        lib.returnItem(patron3, dvd2);
        lib.returnItem(patron2, book1);

        lib.removeItem(book1);

        lib.listAvailable();
    }
}