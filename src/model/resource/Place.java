package model.resource;

import model.utils.CITY;

public class Place {
  private String direction;
  private CITY city;

  public Place(String direction, CITY city) {
    this.direction = direction;
    this.city = city;
  }

  public String getDirection() {
    return this.direction;
  }

  public CITY getCity() {
    return this.city;
  }
}
