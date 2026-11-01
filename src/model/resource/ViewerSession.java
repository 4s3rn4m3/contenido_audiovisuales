package model.resource;

import model.utils.GenerateId;

public class ViewerSession {
  private int viewerId;
  private User user;
  private String device, location, browser;

  public ViewerSession(String device, String location, String browser) {
    this.createSession(device, location, browser);
    this.user = null;
  }

  public ViewerSession(String device, String location, User user, String browser) {
    this.createSession(device, location, browser);
    this.user = user;
  }

  private void createSession(String device, String location, String browser) {
    this.viewerId = GenerateId.generatePositiveNonGuessableInt();
    this.device = device;
    this.location = location;
    this.browser = browser;
  }

  public boolean isRegistered() {
    return user != null;
  }

  public int getViewerId() {
    return this.viewerId;
  }

  public String getSession() {
    return " -- ID:"
        + this.getViewerId()
        + " -- DEVICE:"
        + this.device
        + " -- BROWSER:"
        + this.browser
        + " -- LOCATION:"
        + this.location
        + " -- IS REGISTER?:"
        + (this.isRegistered() ? "YES: email: " + this.user.getEmail() : "NO");
  }
}
