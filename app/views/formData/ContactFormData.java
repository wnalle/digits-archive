package views.formData;

import java.util.ArrayList;
import java.util.List;
import models.Contact;
import play.data.validation.ValidationError;

/**
 * The backing class for the contact form.
 */
public class ContactFormData {
  /** The first name. */
  public String firstName;
  /** The last name. */
  public String lastName;
  /** The telephone number in xxx-xxx-xxxx format.  */
  public String telephone;
  /** The id for the contact */
  public long id;

  /**
   * The public no-arg constructor required by play.
   */
  public ContactFormData() {
    // no arg constructor
  }

  /**
   * Create a contact form from contact.
   * @param contact The contact information.
   */
  public ContactFormData(Contact contact){
    this.firstName = contact.getFirstName();
    this.lastName = contact.getLastName();
    this.telephone = contact.getTelephone();
    this.id = contact.getId();
  }


  /**
   * Validate the new contact form.
   * @return List of errors found.
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName", "First name is required."));
    }
    if (lastName == null || lastName.length() == 0) {
      errors.add(new ValidationError("lastName", "Last  name is required."));
    }
    if (telephone == null || telephone.length() == 0) {
      errors.add(new ValidationError("telephone", "Telephone is required."));
    }
    if (telephone.length() != 12) {
      errors.add(new ValidationError("telephone", "Telephone must be in xxx-xxx-xxxx format."));
    }

    return errors.isEmpty() ? null : errors;
  }
}
