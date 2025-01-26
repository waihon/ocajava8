package playground.variables.hidden;

public class Platypus extends Mammal {
  public int legs = 2;

  public static void main(String[] args) {
    Platypus platypus = new Platypus();
    System.out.println("Legs: " +  platypus.legs);
  }
}
