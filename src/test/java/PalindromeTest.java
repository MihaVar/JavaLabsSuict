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
        assertFalse(palindrome.Palind(null));
        assertFalse(palindrome.Palind("null"));
        assertFalse(palindrome.Palind("null"));
        assertTrue(palindrome.Palind("hannah"));
        assertTrue(palindrome.Palind("pup"));
        assertTrue(palindrome.Palind("nan"));
        assertFalse(palindrome.Palind("lollipop"));
        assertTrue(palindrome.Palind("eye"));
        assertTrue(palindrome.Palind("6543456"));
        assertTrue(palindrome.Palind("step on no pets"));
        assertTrue(palindrome.Palind("A man a plan a canal Panama"));
    }
}
