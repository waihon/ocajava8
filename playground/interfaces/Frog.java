package playground.interfaces;

public class Frog implements CanHop {
    public static void main(String[] args) {
      Frog frog1 = new TurtleFrog();
      TurtleFrog frog2 = new TurtleFrog();
      // Type mismatch
      //BrazilianHornedFrog frog3 = new TurtleFrog();
      CanHop frog4 = new TurtleFrog();
      Object frog5 = new TurtleFrog();
      // Type mismatch
      //Long frog6 = new TurtleFrog();
    }

}
