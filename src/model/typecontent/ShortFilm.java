package model.typecontent;

import java.util.List;
import model.AudiovisualContent;
import model.resource.Actor;
import model.utils.Language;

public class ShortFilm extends AudiovisualContent {
  private List<Actor> actors;
  private boolean publishSponsor;

  public ShortFilm(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      List<Actor> actors,
      boolean publishSponser,
      String tag) {
    super(title, description, dateRelease, duration, language, tag);
    this.actors = actors;
    this.publishSponsor = publishSponsor;
  }

  public void addActor(Actor actor) {
    this.actors.add(actor);
  }

  public void removeActor(Actor actor) {
    int idActor = this.actors.indexOf(actor);
    if (idActor != -1) {
      this.actors.remove(idActor);
      System.out.println("\nActor: " + actor.getName() + " remove!");
      return;
    }
    System.out.println("\nActor: " + actor.getName() + " don't exist");
  }

  public void showActors() {
    for (Actor actor : actors) {
      System.out.println(actor.getCv());
    }
  }

  public boolean getIsPublishSponsor() {
    return this.publishSponsor;
  }

  public void setPublishSponsor(boolean publishSponsor) {
    this.publishSponsor = publishSponsor;
  }

  public void showInfo() {
    System.out.println("\n[+] ShortFilm DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date Release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Sposored : " + this.getIsPublishSponsor());
    System.out.println("- Topic: " + this.getTag());
    System.out.println("- Cast: ");
    showActors();
  }
}
