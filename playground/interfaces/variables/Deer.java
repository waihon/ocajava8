package playground.interfaces.variables;

public class Deer implements Herbivore {

  public void eatGrass() {
    System.out.println("Deer eats grass");
  }

  public int chew() {
    System.out.println("Deer chews");
    return 13;
  }

  public static void main(String[] args) {
    Deer deer = new Deer();
    deer.eatGrass();
    System.out.println(deer.chew());
    // Cannot assign a value to final variable amount
    //Herbivore.amount = 18;
    System.out.println(Herbivore.amount);
  }

}
