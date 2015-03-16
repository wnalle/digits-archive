package models;

/**
 * Mock-up model for backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;
  private long id;

  /** Creates a contact instance.
   *
   * @param firstName The first name.
   * @param lastName The last name.
   * @param telephone The telephone.
   * @param id The id.
   */
  public Contact(long id, String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.id = id;
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

  /** Returns id.
   *
   * @return the id number.
   */

  public long getId() {
    return id;
  }
}
