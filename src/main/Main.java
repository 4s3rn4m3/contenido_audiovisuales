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
    ShortFilm shf = createShortFilm();
    Interview inter = createInterview();
    showInformation(md, doc, sr, shf, inter);
  }

  public static void showInformation(
      Movie md, Documentary doc, Serie sr, ShortFilm shf, Interview inter) {
    md.showInfo();
    doc.showInfo();
    sr.showInfo();
    shf.showInfo();
    inter.showInfo();
  }

  public static Interview createInterview() {
    return new Interview(
        "El ego mata",
        "sobre el ego en las peronas mayores",
        "10/9/2020",
        40,
        Language.SPANISH,
        "Emotions",
        "Gedardo Maquiavelo",
        "Gustavo Navitas");
  }

  public static ShortFilm createShortFilm() {
    List<Actor> actors = getListOfActors();

    return new ShortFilm(
        "El puercoespín",
        "About the insolation",
        "10/3/2013",
        45,
        Language.SPANISH,
        actors,
        false,
        "Terror; Suspense");
  }

  public static Movie createMovie() {
    List<Actor> actors = getListOfActors();

    return new Movie(
        "Avatar",
        "About a guy that wants to save the worl",
        "10/3/2003",
        125,
        "Old city CR",
        Language.ENGLISH,
        actors,
        "Fantasy");
  }

  public static Documentary createDocumentary() {
    List<Researcher> researchers = getListOfResearchers();
    return new Documentary(
        "Old Teachers",
        "About the teacher that are very old and they still programming",
        "11/7/2203",
        35,
        Language.ENGLISH,
        researchers,
        "Humans ");
  }

  public static Serie createSerie() {
    return new Serie(
        "The walking dead", "Zoombies series.", "3/8/2006", 45, Language.GERMAN, 8, 10, "Actions");
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
