package playground.methods.hidden;

public class Beaver extends Rodent {
  // Error: chew() in Beaver cannot override chew() in Rodent
  // overriden method is static
  public Number chew() throws RuntimeException {
    System.out.println("Beaver is chewing on wood");
    return 2;
  }

}
