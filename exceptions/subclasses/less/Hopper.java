package exceptions.subclasses.less;

import exceptions.subclasses.CanNotHopException;

public class Hopper {
  public static void main(String[] args) {
    try {
      new Hopper().hop();
    } catch (CanNotHopException e) {
      System.out.println("Cannot hop");
    }
  }

  public void hop() throws CanNotHopException {
    System.out.println("A hopper hops");
  }
}
