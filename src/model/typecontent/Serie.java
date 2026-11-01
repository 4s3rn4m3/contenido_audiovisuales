package model.typecontent;

import java.util.List;
import model.AudiovisualContent;
import model.resource.Actor;
import model.resource.Session;
import model.utils.Language;

public class Serie extends AudiovisualContent {
  private Session session;
  private List<Actor> actors;

  public Serie(
      String title,
      String description,
      String dateRelease,
      int duration,
      Language language,
      int se,
      int ep,
      List<Actor> actors,
      String tag) {
    super(title, description, dateRelease, duration, language, tag);
    session = new Session(se, ep);
    this.actors = actors;
  }

  public String getSession() {
    return session.getStats();
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
    System.out.println("\n[+] SEREIE DESCRIPTION:\n");
    System.out.println("- Id: " + this.getId());
    System.out.println("- Title: " + this.getTitle());
    System.out.println("- Description: " + this.getDescription());
    System.out.println("- Date release: " + this.getDateRelease());
    System.out.println("- Duration: " + this.getDuration());
    System.out.println("- Language: " + this.getLanguage());
    System.out.println("- Topic : " + this.getTag());
    System.out.println("- " + this.getSession());
    System.out.println("- Cast: ");
    showActors();
  }
}
