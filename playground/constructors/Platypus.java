package playground.constructors;

public class Platypus extends Mammal {
  public Platypus() {
    // Error: constructor Mammal in class Mammal cannot be applied to given types.
    // required: int
    // found: no arguments
    System.out.println("Platypus");
  }

  public static void main(String[] args) {
    new Mammal(5);
  }

}
