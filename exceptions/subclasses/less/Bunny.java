package exceptions.subclasses.less;

public class Bunny extends Hopper {
  public static void main(String[] args) {
    new Bunny().hop();
  }

  public void hop() {
    System.out.println("A bunny hops as well.");
  }
}
