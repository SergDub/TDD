import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        assertNotEquals(phoneBook.add("TEST", "TEST"), 0);
    }


}
