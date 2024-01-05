package org.example;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        assertTrue(library.addBook("Book1", "Author1", 1234567890L, 2020));
        assertTrue(library.addBook("Book2", "Author2", 9876543210L, 2015));

        assertEquals(2, library.getSize());
    }

    @Test
    public void testAddDuplicateBook() {
        assertTrue(library.addBook("Book1", "Author1", 1234567890L, 2020));
        assertFalse(library.addBook("Book1", "Author1", 1234567890L, 2020));

        assertEquals(1, library.getSize());
    }

    @Test
    public void testShowBooks() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        // Redirect System.out.println to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.showBooks();

        String expectedOutput = "Book [Name: Book1, Author: Author1, ISBN: 1234567890, Year: 2020]\n" +
                "Book [Name: Book2, Author: Author2, ISBN: 9876543210, Year: 2015]\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testSearchByName() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        // Redirect System.out.println to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.searchByName("Book1");

        String expectedOutput = "Book [Name: Book1, Author: Author1, ISBN: 1234567890, Year: 2020]\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testSearchByNameNonExistent() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        // Redirect System.out.println to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.searchByName("Nonexistent");

        String expectedOutput = "Book doesn't exist\n" +
                "Book doesn't exist\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testDeleteBook() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        library.deleteBook(1234567890L);

        assertEquals(1, library.getSize());
    }

    @Test
    public void testDeleteNonExistentBook() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        // Redirect System.out.println to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.deleteBook(1111111111L);

        String expectedOutput = "Book not found!\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFindIndex() {
        library.addBook("Book1", "Author1", 1234567890L, 2020);
        library.addBook("Book2", "Author2", 9876543210L, 2015);

        assertEquals(0, library.findIndex(1234567890L));
        assertEquals(1, library.findIndex(9876543210L));
        assertEquals(-1, library.findIndex(1111111111L));
    }
}