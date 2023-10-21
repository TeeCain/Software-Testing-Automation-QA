import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    // An instance of ContactService
    ContactService contactService = new ContactService();

    @Test
    public void addContact() {
        // Create a new Contact and add it to the ContactService
        Contact contact1 = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact1);

    }

    @Test
    public void deleteContact() {
        // Create a new Contact and add it to the ContactService
        Contact contact1 = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact1);

        // Delete the contact by its ID from the ContactService
        contactService.deleteContact("12345");

    }

    @Test
    public void updateContact() {
        // Create a new Contact and add it to the ContactService
        Contact contact1 = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact1);

        // Update the first name of the contact in the ContactService
        contactService.updateContact("12345", "firstname", "Mike");

    }

    @Test
    public void getContact() {
        // Create a new Contact object and add it to the ContactService
        Contact contact1 = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact1);


    }
}
