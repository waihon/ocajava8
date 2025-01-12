package inheritance.variables.hiding;

public class Mouse extends Rodent {
  protected int tailLength = 8;

  public void getMouseDescription() {
    System.out.println("Tail: " + tailLength + ", Parent tail: " + super.tailLength);
  }

  public static void main(String[] args) {
    Mouse mouse = new Mouse();
    mouse.getRodentDescription();
    mouse.getMouseDescription();
  }

}
