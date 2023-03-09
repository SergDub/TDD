public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", "+3-111-111-11-11");
        phoneBook.add("Mike", "+3-222-222-22-11");
        phoneBook.add("Tom", "+3-333-3331-33-11");

        System.out.println(phoneBook.findByNumber("+3-111-111-11-11"));
        System.out.println(phoneBook.findByNumber("+3-000-000-000"));
        System.out.println();

        System.out.println(phoneBook.findByName("Tom"));
        System.out.println(phoneBook.findByName("Elsa"));

        System.out.println(phoneBook.printAllNames());
    }

}
