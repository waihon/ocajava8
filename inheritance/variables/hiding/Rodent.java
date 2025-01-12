package inheritance.variables.hiding;

public class Rodent {
  protected int tailLength = 4;

  public void getRodentDescription() {
    System.out.println("Parent tail: " + tailLength);
  }
}
