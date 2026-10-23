package model.utils;

import java.security.SecureRandom;

public class GenerateId {

  private static final SecureRandom secureRandom = new SecureRandom();

  public static int generatePositiveNonGuessableInt() {
    return secureRandom.nextInt(Integer.MAX_VALUE);
  }
}
