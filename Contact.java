public class Contact {
    String contactID;
    String firstName;
    String lastName;
    String phone;
    String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        // Check and enforce the contactID length requirement
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be null and cannot exceed 10 characters");
        }

        // Check and enforce the firstName length requirement
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name must not be null and cannot exceed 10 characters");
        }

        // Check and enforce the lastName length requirement
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name must not be null and cannot exceed 10 characters");
        }

        // Check and enforce the phone number requirement
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits and must not be null");
        }

        // Check and enforce the address length requirement
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and cannot exceed 30 characters");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name must not be null and cannot exceed 10 characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name must not be null and cannot exceed 10 characters");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits and must not be null");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and cannot exceed 30 characters");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
                + phone + ", address=" + address + "]";
    }
}

