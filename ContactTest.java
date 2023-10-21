import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void getContactID() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        assertEquals("01", person1.getContactID());
    }

    @Test
    public void getFirstName() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        assertEquals("Amy", person1.getFirstName());
    }

    @Test
    public void setFirstName() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        person1.setFirstName("John");
        assertEquals("John", person1.getFirstName());
    }

    @Test
    public void getLastName() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        assertEquals("Doe", person1.getLastName());
    }

    @Test
    public void setLastName() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        person1.setLastName("James");
        assertEquals("James", person1.getLastName());
    }

    @Test
    public void getPhone() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        assertEquals("0123456789", person1.getPhone());
    }

    @Test
    public void setPhone() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        person1.setPhone("9876543210");
        assertEquals("9876543210", person1.getPhone());
    }

    @Test
    public void getAddress() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        assertEquals("123 Apple Lane", person1.getAddress());
    }

    @Test
    public void setAddress() {
        Contact person1 = new Contact("01" ,"Amy" ,"Doe" ,"0123456789" ,"123 Apple Lane");
        person1.setAddress("321 Orange Street");
        assertEquals("321 Orange Street", person1.getAddress());
    }

    @Test
    public void testToString() {
    }

    @Test
    public void invalidContactID() {
        Contact person1 = new Contact("", "Amy", "Doe", "0123456789", "123 Apple Lane");
        // This test should fail since the contact ID is invalid
        assertNotEquals("01", person1.getContactID());
    }

    @Test
    public void invalidFirstName() {
        Contact person1 = new Contact("01", null, "Doe", "0123456789", "123 Apple Lane");
        // This test should fail since the first name is invalid
        assertNotEquals("Amy", person1.getFirstName());
    }

    @Test
    public void invalidPhoneNumber() {
        Contact person1 = new Contact("01", "Amy", "Doe", "abcde", "123 Apple Lane");
        // This test should fail since the phone number is invalid
        assertNotEquals("0123456789", person1.getPhone());
    }

    @Test
    public void invalidAddress() {
        Contact person1 = new Contact("01", "Amy", "Doe", "0123456789", "");
        // This test should fail since the address is invalid
        assertNotEquals("123 Apple Lane", person1.getAddress());
    }
}
