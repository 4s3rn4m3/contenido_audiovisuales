package model.typecontent;

import model.AudiovisualContent;
import model.utils.*;

public class Movie extends AudiovisualContent {
  private String studio;

  public Movie(String title, String description, int duration, String studio, Language language) {
    super(title, description, duration, language);
    this.studio = studio;
  }

  public String getStudio() {
    return this.studio;
  }

  @Override
  public void showInfo() {
    System.out.println("\n[+] MOVIE DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Studio: " + this.getStudio() + "\n");
  }
}
