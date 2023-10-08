package org.example;

public class Book {
    private String Name;

    private String Author;

    private long ISBN;

    private int Year;

    public Book(String name, String author, long ISBN, int year) {
        this.Name = name;
        this.Author = author;
        this.ISBN = ISBN;
        this.Year = year;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Book Name = '" + Name + '\'' +
                ", Book Author = " + Author +
                ", Book ISBN = " + ISBN +
                ", Year of publishment = " + Year;
    }
}
