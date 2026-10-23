package model.resource;

public class Session {
  private int numSession;
  private int numEp;

  public Session(int numSession, int numEp) {
    this.numSession = numSession;
    this.numEp = numEp;
  }

  public String getStats() {
    return "Sessions: " + this.numSession + " EP: " + this.numEp + " \n";
  }
}
