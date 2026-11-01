package main;

import java.util.ArrayList;
import java.util.List;
import model.resource.*;
import model.typecontent.*;
import model.utils.*;

public class Main {
  public static void main(String[] args) {

    Movie md = createMovie();
    Documentary doc = createDocumentary();
    Serie sr = createSerie();
    LiveStream lvs = createLiveStream();
    Interview inter = createInterview();

    showInformation(md, doc, sr, lvs, inter);
  }

  public static void showInformation(
      Movie md, Documentary doc, Serie sr, LiveStream lvs, Interview inter) {
    md.showInfo();
    doc.showInfo();
    sr.showInfo();
    lvs.showInfo();
    inter.showInfo();
  }

  public static Interview createInterview() {
    Place pl = new Place("Calle Arboreal y 32 norte", CITY.MEDALLIN);
    return new Interview(
        "El ego mata",
        "sobre el ego en las peronas mayores",
        "10/9/2020",
        40,
        Language.SPANISH,
        pl,
        "Emotions",
        "Gedardo Maquiavelo",
        "Gustavo Navitas");
  }

  public static LiveStream createLiveStream() {
    List<ViewerSession> viwers = getListOfViewers();
    return new LiveStream(
        "IRL en las Mejores universidades del MUNDO!",
        "Ven y mira las oportunidades de cada universidad y pasar el rato...",
        "10/3/2013",
        80,
        Language.SPANISH,
        viwers,
        true,
        "IRL;EDUCATION");
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
    List<Actor> actors = getListOfActors();
    return new Serie(
        "The walking dead",
        "Zoombies series.",
        "3/8/2006",
        45,
        Language.GERMAN,
        8,
        10,
        actors,
        "Actions");
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

  public static List<ViewerSession> getListOfViewers() {
    List<ViewerSession> viewers = new ArrayList<>();
    User user1 = new User("l4m3d0r4@gmail.com");
    User user3 = new User("gustavo1@gmail.com");
    User user8 = new User("egomelitria38@gmail.com");
    ViewerSession v1 = new ViewerSession("Iphone", "Spain", null, "Safari");
    ViewerSession v2 = new ViewerSession("Android", "Russia", user1, "Firefox");
    ViewerSession v3 = new ViewerSession("PC", "California", null, "Chrome");
    ViewerSession v4 = new ViewerSession("Samsung", "Guatemala", user8, "Brave");
    ViewerSession v5 = new ViewerSession("Nokia", "Mejico", user3, "Explorer");
    ViewerSession v6 = new ViewerSession("Tablet", "Salvador", null, "Safari");
    ViewerSession v7 = new ViewerSession("TV", "Haiti", null, "OperaX");
    viewers.add(v1);
    viewers.add(v2);
    viewers.add(v3);
    viewers.add(v4);
    viewers.add(v5);
    viewers.add(v6);
    viewers.add(v7);
    return viewers;
  }
}
