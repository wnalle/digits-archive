package models;


import java.util.ArrayList;
import java.util.List;
import views.formData.ContactFormData;

/**
 * Mock-up internal in-memory data structure.
 */
public class ContactDB {
  /**
   * The list of contacts.
   */
  public static List<Contact> contacts = new ArrayList<>();

  /**
   * Add a new contact to the list.
   * @param formData Form containing the first name, last name and telephone number for a new contact.
   */
  public static void addContact(ContactFormData formData) {
    Contact contact = new Contact(formData.firstName, formData.lastName, formData.telephone);
    contacts.add(contact);
  }

  /**
   * Returns the list of contacts.
   * @return The list of contacts.
   */
  public static List<Contact> getContacts() {
    return contacts;
  }
}
