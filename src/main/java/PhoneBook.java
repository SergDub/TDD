import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    static Map<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        Set<Map.Entry<String, String>> entrySet = phoneBook.entrySet();
        String name = "Номер отсутствует";
        for (Map.Entry<String, String> entry :phoneBook.entrySet()) {

            if (entry.getValue().equals(number)) {
                name = entry.getKey();
            }
        }
        return name;
    }
}
