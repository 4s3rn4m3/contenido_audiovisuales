package model.typecontent;

import java.util.List;
import model.AudiovisualContent;
import model.resource.Researcher;
import model.utils.Language;

public class Documentary extends AudiovisualContent {
  private String topic;
  private List<Researcher> researchers;

  public Documentary(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      List<Researcher> researchers,
      String tag) {
    super(title, description, dateRelease, duration, language, tag);
    this.researchers = researchers;
  }

  public String getTopic() {
    return this.topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public void addResearch(Researcher researcher) {
    this.researchers.add(researcher);
  }

  public void removeResearcher(Researcher researcher) {
    int id = this.researchers.indexOf(researcher);
    if (id != -1) {
      this.researchers.remove(id);
      System.out.println("\nResearcher: " + researcher.getName() + " remove!");
      return;
    }
    System.out.println("\nResearcher: " + researcher.getName() + " don't exist");
  }

  public void showResearchers() {
    for (Researcher researcher : researchers) {
      System.out.println(researcher.getName());
    }
  }

  @Override
  public void showInfo() {
    System.out.println("\n[+] DOCUMENTAL DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date Release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Topic: " + this.getTag());
    System.out.println("- Researchers: ");
    showResearchers();
  }
}
