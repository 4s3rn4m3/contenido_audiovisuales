package model.typecontent;

import model.AudiovisualContent;
import model.utils.Language;

public class Documental extends AudiovisualContent {
  private String topic;

  public Documental(
      String title, String description, int duration, String topic, Language language) {
    super(title, description, duration, language);
    this.topic = topic;
  }

  public String getTopic() {
    return this.topic;
  }

  @Override
  public void showInfo() {
    System.out.println("\n[+] DOCUMENTAL DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Topic: " + this.getTopic() + "\n");
  }
}
