package model.resource;

public class Researcher {

  private String name;

  public Researcher(String name) {
    this.name = name;
  }

  public String getName() {
    return "   - " + this.name;
  }
}
