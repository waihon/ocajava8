package staticfinal;

public class RopeSwing {
  private static final String leftRope;
  private static final String rightRope;
  private static final String bench;  // Does not compile as it's not set
  private static final String name = "name";

  static {
    leftRope = "left";
    rightRope = "right";
  }

  static {
    //name = "name";  // Does not compile as name is set twice
    rightRope = "right";  // Does not compile as rightRope is set twice
  }

  public static void main(String[] args) {
    //bench = "bench";  // Does not compile as static final variable is not allowed to be set in a method
  }
}
