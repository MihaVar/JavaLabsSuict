import org.example.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@SuppressWarnings("ALL")
public class PalindromeTest {
    Palindrome palindrome;
    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void testIsPalindrome() {
        assertTrue(palindrome.Palind("Tenet"));
        assertTrue(palindrome.Palind("aBBa"));
        assertTrue(palindrome.Palind("cIVIC"));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(palindrome.Palind("Hercules"));
    }
}
