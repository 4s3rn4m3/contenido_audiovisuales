package model;

import model.utils.*;

public abstract class AudiovisualContent {
  private String title, description;
  private int duration, id;
  private Language language;
  private String dateRelease;
  private String tag;

  public AudiovisualContent(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      String tag) {
    this.id = GenerateId.generatePositiveNonGuessableInt();
    this.title = title;
    this.description = description;
    this.dateRelease = dateRelease;
    this.duration = duration;
    this.language = language;
    this.tag = tag;
  }

  public int getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDescription() {
    return this.description;
  }

  public String getDateRelease() {
    return this.dateRelease;
  }

  public int getDuration() {
    return this.duration;
  }

  public Language getLanguage() {
    return this.language;
  }

  public String getTag() {
    return this.tag;
  }

  public abstract void showInfo();
}
