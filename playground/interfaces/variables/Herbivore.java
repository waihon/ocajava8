package playground.interfaces.variables;

public interface Herbivore {

  // Interface variables are assumed to public, static, and final.
  int amount = 10;

  // Interface methods are assumed to be public but not abstract any more.
  public static void eatGrass() {};

  // Interface methods are assumed to be public but not abstract any more.
  public default int chew() {
    return 13;
  }

}
