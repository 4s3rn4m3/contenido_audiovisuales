package main;

import java.util.ArrayList;
import java.util.List;
import model.*;
import model.resource.Actor;
import model.resource.Researcher;
import model.typecontent.*;
import model.utils.*;

public class Main {
  public static void main(String[] args) {

    Movie md = createMovie();
    Documentary doc = createDocumentary();
    Serie sr = createSerie();
    showInformation(md, doc, sr);
  }

  public static void showInformation(Movie md, Documentary doc, Serie sr) {
    md.showInfo();
    doc.showInfo();
    sr.showInfo();
  }

  public static Movie createMovie() {
    List<Actor> actors = getListOfActors();

    Movie md =
        new Movie(
            "Avatar",
            "About a guy that wants to save the worl",
            125,
            "Old city CR",
            Language.SPANISH,
            actors);
    return md;
  }

  public static Documentary createDocumentary() {
    List<Researcher> researchers = getListOfResearchers();
    Documentary doc =
        new Documentary(
            "Old Teachers",
            "About the teacher that are very old and they still programming",
            35,
            "Technology",
            Language.ENGLISH,
            researchers);
    return doc;
  }

  public static Serie createSerie() {
    Serie sr = new Serie("The walking dead", "Zoombies series.", 45, Language.GERMAN, 8, 10);
    return sr;
  }

  public static List<Actor> getListOfActors() {
    List<Actor> actors = new ArrayList<>();
    Actor actor1 = new Actor("Leonado dicaprio", 89, true, 23);
    Actor actor2 = new Actor("Mateo ramize", 13, false, 7);
    Actor actor3 = new Actor("Paula lopilezes", 12, false, 3);
    Actor actor4 = new Actor("Sabreco Mempicos", 28, true, 5);
    actors.add(actor1);
    actors.add(actor2);
    actors.add(actor3);
    actors.add(actor4);
    return actors;
  }

  public static List<Researcher> getListOfResearchers() {
    List<Researcher> researchers = new ArrayList<>();
    Researcher research1 = new Researcher("Gustavo Navajazo");
    Researcher research2 = new Researcher("Amori Narvaez ");
    researchers.add(research1);
    researchers.add(research2);
    return researchers;
  }
}
