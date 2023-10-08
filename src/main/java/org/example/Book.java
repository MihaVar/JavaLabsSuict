package org.example;

import java.util.Random;

public class Book extends Item {
    private final String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }



    @Override
    public String idGenerator() {
        Random rnd = new Random();
        Library library = new Library();
        String result = rnd.ints(48, 123)
                .limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        if(library.getItems().stream().map(x -> x.getUniqueID().equals(result)).findAny().isPresent())
            return idGenerator();
        return result;
    }


    @Override
    public String toString() {
        return "Book title: " + super.getTitle() + ", Author: " + author + ";\n";
    }
}
