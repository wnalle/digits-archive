package models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formData.ContactFormData;

/**
 * Mock-up internal in-memory data structure.
 */
public class ContactDB {
  /**
   * The list of contacts.
   */
  public static Map<Long, Contact> contacts = new HashMap<>();
  private static long currentId = 1;

  /**
   * Add a new contact to the list.
   * @param formData Form containing the first name, last name and telephone number for a new contact.
   */
  public static void addContact(ContactFormData formData) {
    long idVal = (formData.id == 0) ? currentId++ : formData.id;
    Contact contact = new Contact(idVal, formData.firstName, formData.lastName, formData.telephone);
    contacts.put(idVal, contact);
  }

  /**
   * Returns the contact associated wtih id or throws a RuntimeException.
   * @param id The id.
   * @return The contact.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("Could not find the contact with associated id.");
    }

    return contact;
  }



  /**
   * Returns the list of contacts.
   * @return The list of contacts.
   */
  public static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }

  /**
   * Get a contact from an id.
   * @param id The id.
   * @return The contact.
   */
  public static Contact getContact(Long id) {
    return contacts.get(id);
  }
}
