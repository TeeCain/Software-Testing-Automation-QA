import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // A HashMap to store contacts with their unique contact IDs
    private Map<String, Contact> contacts = new HashMap<>();

    // Method to add a new contact service
    public void addContact(Contact contact) {
        // Check if the provided contact is null
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null.");
        }


        String contactID = contact.getContactID();
        String firstName = contact.getFirstName();
        String lastName = contact.getLastName();
        String phone = contact.getPhone();
        String address = contact.getAddress();

        // Validate contact attributes
        if (contactID == null || contactID.isEmpty() || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID.");
        }

        if (firstName == null || firstName.isEmpty() || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name.");
        }

        if (lastName == null || lastName.isEmpty() || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name.");
        }

        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number.");
        }

        if (address == null || address.isEmpty() || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address.");
        }


        contacts.put(contact.getContactID(), contact);
    }

    // Method to delete a contact by its ID
    public void deleteContact(String contactID) {
        if (contactID == null || contactID.isEmpty() || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID.");
        }


        contacts.remove(contactID);
    }

    // Method to update a contact
    public void updateContact(String contactID, String fieldName, String value) {
        if (contactID == null || contactID.isEmpty() || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID.");
        }


        Contact contact = contacts.get(contactID);

        // If the contact exists, update the specified field
        if (contact != null) {
            switch (fieldName.toLowerCase()) {
                case "firstname" -> contact.setFirstName(value);
                case "lastname" -> contact.setLastName(value);
                case "number" -> contact.setPhone(value);
                case "address" -> contact.setAddress(value);
                default -> System.out.println("Invalid field name: " + fieldName);
            }
        }
    }

    // Method to retrieve a contact by its ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
