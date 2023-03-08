import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        assertNotEquals(phoneBook.add("TEST", "TEST"), 0);
    }

    @Test
    void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();

        String testName = "Petr";
        String testNumber = "+7-800-000-00-00";

        String expected = testNumber;

        String actual = phoneBook.findByNumber(testNumber);
        assertEquals(expected, actual);
    }
}
