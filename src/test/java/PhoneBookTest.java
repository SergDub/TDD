import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private final String testName = "Petr";
    private final String testNumber = "+7-800-000-00-00";
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void add() {

        assertNotEquals(phoneBook.add("TEST", "TEST"), 0);
    }

    @Test
    void findByNumberTest() {
        phoneBook.add(testName, testNumber);
        String expected = "Petr";
        String actual = phoneBook.findByNumber(testNumber);

        assertEquals(expected, actual);
    }
}
