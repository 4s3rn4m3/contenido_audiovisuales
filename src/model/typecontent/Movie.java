package model.typecontent;

import java.util.List;
import model.AudiovisualContent;
import model.resource.Actor;
import model.utils.*;

public class Movie extends AudiovisualContent {
  private String studio;
  private List<Actor> actors;

  public Movie(
      String title,
      String description,
      int duration,
      String studio,
      Language language,
      List<Actor> actors) {
    super(title, description, duration, language);
    this.studio = studio;
    this.actors = actors;
  }

  public String getStudio() {
    return this.studio;
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

  @Override
  public void showInfo() {
    System.out.println("\n[+] MOVIE DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Studio: " + this.getStudio());
    System.out.println("- Studio: " + this.getStudio());
    System.out.println("- Cast: ");
    showActors();
  }
}
