import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private final Map<String, String> contacts;

    public TelephoneBook() {
        this.contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        contacts.put(name,  phoneNumber);
    }
    public void deleteContactByName(String name) {
        contacts.remove(name);
    }
    public String searchPersonByName(String name) {
        return contacts.get(name);
    }
    public String searchPhoneNumberByName(String name) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void printAllContacts() {
        System.out.println("All Contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.addContact("John", "1234567890");
        telephoneBook.addContact("Winston", "0987654321");

        telephoneBook.printAllContacts();

        String phoneNumber = telephoneBook.searchPersonByName("John");
        if (phoneNumber != null) {
            System.out.println("Phone Number of John: " + phoneNumber);
        } else {
            System.out.println("John not found in the contacts.");
        }
        telephoneBook.deleteContactByName("Winston");

        telephoneBook.printAllContacts();
    }
}
