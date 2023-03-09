import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private final String testName = "Dima";
    private final String testName1 = "Vova";
    private final String testName2 = "Masha";
    private final String testNumber = "+7-800-000-00-00";
    private final String testNumber1 = "+7-800-000-00-01";
    private final String testNumber2 = "+7-800-000-00-02";
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void add() {

        assertNotEquals(phoneBook.add("TEST", "TEST"), 0);
    }

    @Test
    void findByNumberTest() {
        phoneBook.add(testName, testNumber);
        String expected = "Dima";
        String actual = phoneBook.findByNumber(testNumber);

        assertEquals(expected, actual);
    }

    @Test
    void findByNameTest() {
        phoneBook.add(testName, testNumber);

        String expected = "+7-800-000-00-00";
        String actual = phoneBook.findByName(testName);

        assertEquals(expected, actual);
    }

    @Test
    void printAllNames() {
        phoneBook.add(testName, testNumber);
        phoneBook.add(testName1, testNumber1);
        phoneBook.add(testName2, testNumber2);

        List<String> expected = List.of("Dima", "Masha", "Vova");
        List<String> actual = phoneBook.printAllNames();
        assertEquals(expected, actual);

        //verify(publishing,times(1)).publishInformation(person);
    }
}
