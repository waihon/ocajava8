package exceptions.subclasses.more;

import exceptions.subclasses.CanNotHopException;

public class Bunny extends Hopper {
  // overridden method does not throw CanNotHopException
  public void hop() throws CanNotHopException {
    System.out.println("A bunny hops as well.");
  }
}
