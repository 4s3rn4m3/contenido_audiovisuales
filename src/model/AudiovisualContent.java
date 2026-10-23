package model;

import model.utils.*;

public abstract class AudiovisualContent {
  private String title, description;
  private int duration, id;
  private Language language;

  public AudiovisualContent(String title, String description, int duration, Language language) {
    this.id = GenerateId.generatePositiveNonGuessableInt();
    this.title = title;
    this.description = description;
    this.duration = duration;
    this.language = language;
  }

  public int getId() {
    return this.id;
  }

  public Language getLanguage() {
    return this.language;
  }

  public abstract void showInfo();
}
