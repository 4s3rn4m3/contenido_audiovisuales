package model.resource;

public class Actor {
  private String name;
  private int age;
  private int priceHour;
  private boolean oscarWinner;
  private int moviesWorked;

  public Actor(String name, int age, boolean oscarWinner, int moviesWorked) {
    this.name = name;
    this.age = age;
    this.oscarWinner = oscarWinner;
    this.moviesWorked = moviesWorked;
  }

  public int getPriceHour() {
    return this.oscarWinner ? 150 : 35;
  }

  public String getName() {
    return this.name;
  }

  public String getCv() {
    return "  - Name: "
        + this.name
        + "\n  - Age: "
        + this.age
        + "\n  - Oscar Winner: "
        + this.oscarWinner
        + "\n  - Experience: "
        + this.moviesWorked
        + " movies done "
        + "\n  - Price for hour: "
        + this.getPriceHour()
        + "$\n";
  }
}
