package org.example;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public int getSize(){
        return books.size();
    }

    public boolean addBook(String n, String au, long isbn, int y) {
        int flag = 0;
        for (Book b : books) {
            if(b.getISBN() == isbn) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            return books.add(new Book(n, au, isbn, y));
        }
        else {
            return false;
        }
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public void searchByName(String n) {
        for (Book b : books) {
            if(n == b.getName()) {

                System.out.println(b);
            }
            else {
                System.out.println("Book doesn't exist");
            }
        }
    }


    public void deleteBook(long isbn) {
        int num = findIndex(isbn);
        if(num == -1){
            System.out.println("Book not found!");
        }
        else {
            books.remove(findIndex(isbn));
        }

    }

    public int findIndex(long isbn){
        int index = -1;

        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getISBN() == isbn) {
                index = i;
                break;
            }
        }
        return index;
    }
}
