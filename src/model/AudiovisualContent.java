package model;

import model.utils.*;

public abstract class AudiovisualContent {
  private String title, description;
  private int duration, id;

  public AudiovisualContent(String title, String description, int duration) {
    this.id = GenerateId.generatePositiveNonGuessableInt();
    this.title = title;
    this.description = description;
    this.duration = duration;
  }

  public int getId() {
    return this.id;
  }

  public abstract void showInfo();
}
