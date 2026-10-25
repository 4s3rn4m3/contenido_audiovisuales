package model.typecontent;

import model.AudiovisualContent;
import model.resource.Session;
import model.utils.Language;

public class Serie extends AudiovisualContent {
  private Session session;

  public Serie(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      int se,
      int ep,
      String tag) {
    super(title, description, dateRelease, duration, language, tag);
    session = new Session(se, ep);
  }

  public String getSession() {
    return session.getStats();
  }

  @Override
  public void showInfo() {
    System.out.println("\n[+] SEREIE DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Topic : " + this.getTag());
    System.out.println("- " + this.getSession());
  }
}
