package models;

/**
 * Mock-up model for backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;

  /** Creates a contact instance.
   *
   * @param firstName The first name.
   * @param lastName The last name.
   * @param telephone The telephone.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /** Returns first name.
   *
   * @return the first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /** Returns last name.
   *
   * @return the last name.
   */
  public String getLastName() {
    return lastName;
  }

  /** Returns telephone.
   *
   * @return the telephone number.
   */
  public String getTelephone() {
    return telephone;
  }
}
