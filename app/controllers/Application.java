package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formData.ContactFormData;
import views.html.Index;
import views.html.NewContact;
/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Handles the rquest to get the new contact page.
   * @return The NewContact page.
   */
  public static Result newContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class);
    return ok(NewContact.render(formData));

  }

  /** Handles the request to post form data from the NewContact page.
   *
   * @return The page with the form data filled in.
   */
  public static Result postContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(NewContact.render(formData));
    }
    else {
      ContactFormData data = formData.get();
      System.out.printf("Got data: %s %s %s %n\n", data.firstName, data.lastName, data.telephone);
      return ok(NewContact.render(formData));
    }
  }
}
