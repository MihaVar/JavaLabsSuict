import org.example.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class LibraryTest {
    private Library library;
    private Patron patron1;
    private Patron patron2;
    private Book book1;
    private Book book2;
    private DVD dvd1;
    private DVD dvd2;

    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("Name1", "Author1");
        book2 = new Book("Name2", "Author2");
        dvd1 = new DVD("Name1", 1);
        dvd2 = new DVD("Name2", 2);
        patron1 = new Patron("Patron1");
        patron2 = new Patron("Patron2");

    }
    @Test
    public void testAdd() {
        assertTrue(library.addItem(book1));
        assertFalse(library.addItem(book1));
    }

    @Test
    public void testRemove() {
        assertTrue(library.addItem(dvd1));
        assertNotNull(library.removeItem(dvd1));
        assertNull(library.removeItem(dvd1));
    }
    @Test
    public void testRegisterPatron() {
        assertTrue(library.registerPatron(patron1));
        assertFalse(library.registerPatron(patron1));
    }

    @Test
    public void testLendItem() {
        assertTrue(library.addItem(book1));
        assertTrue(library.registerPatron(patron1));

        assertTrue(library.lendItem(patron1, book1));
        assertFalse(library.lendItem(patron1, book1));
    }

    @Test
    public void testReturnItem() {
        assertTrue(library.addItem(dvd1));
        assertTrue(library.registerPatron(patron1));

        assertTrue(library.lendItem(patron1, dvd1));
        assertNotNull(library.returnItem(patron1, dvd1));
        assertNull(library.returnItem(patron1, dvd1));
        assertNull(library.returnItem(patron1, dvd2));
    }



    @Test
    public void testBorrowedList() {
        assertTrue(library.addItem(book1));
        assertTrue(library.addItem(book2));
        assertTrue(library.registerPatron(patron1));
        assertTrue(library.registerPatron(patron2));

        assertTrue(library.lendItem(patron1, book1));
        assertTrue(library.lendItem(patron2, book2));

        assertEquals(2, library.borrowedList().size());

        library.returnItem(patron1, book1);
        library.returnItem(patron2, book2);

        assertNull(library.borrowedList());
    }

    @Test
    public void testAvailableList() {
        assertTrue(library.addItem(dvd1));
        assertTrue(library.addItem(dvd2));

        assertEquals(2, library.availableList().size());

        assertTrue(library.registerPatron(patron1));

        assertTrue(library.lendItem(patron1, dvd1));

        assertEquals(1, library.availableList().size());

        library.returnItem(patron1, dvd1);

        assertEquals(2, library.availableList().size());
    }
}