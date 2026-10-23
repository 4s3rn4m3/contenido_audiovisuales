package model;

import model.utils.*;

public abstract class AudiovisualContent {
  private String title;
  private String description;
  private int duration;

  public AudiovisualContent(String title, String description, int duration) {
    this.title = title;
    this.description = description;
    this.duration = duration;
  }

  public abstract void showInfo();
}
