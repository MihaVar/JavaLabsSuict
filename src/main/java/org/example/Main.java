package org.example;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("A Scandal in Bohemia", "Arthur Conan Doyle", 9780761361855L, 1891);
        lib.addBook("Dialogues", "Plato", 9781016324632L, 1871);
        lib.addBook("1984", "George Orwell", 9780198185215L, 1949);
        lib.addBook("The Adventures of Tom Sawyer", "Mark Twen", 9780753454787L, 1876);
        lib.showBooks();
        System.out.println();
        lib.deleteBook(9780753454787L);
        lib.showBooks();
        System.out.println();
        lib.searchByName("A Scandal in Bohemia");
    }
}