package inheritance.methods.hiding;

public class Panda extends Bear {
  // The eat() method in the child class hides the eat() method in the parent class.
  public static void eat() {
    System.out.println("Panda bear is chewing");
  }

  public static void main(String[] args) {
    Panda.eat();
    Bear.eat();
  }
}
