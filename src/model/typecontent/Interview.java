package model.typecontent;

import model.AudiovisualContent;
import model.utils.Language;

public class Interview extends AudiovisualContent {
  private String host;
  private String guesst;

  public Interview(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      String tag,
      String host,
      String guesst) {
    super(title, description, dateRelease, duration, language, tag);
    this.host = host;
    this.guesst = guesst;
  }

  public String getHost() {
    return this.host;
  }

  public String getGuesst() {
    return this.guesst;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public void setGuesst(String guesst) {
    this.guesst = guesst;
  }

  public void showInfo() {
    System.out.println("\n[+] INTERVIEW DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date Release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Topic: " + this.getTag());
    System.out.println("- Host: " + this.getHost());
    System.out.println("- Guesst : " + this.getGuesst());
  }
}
