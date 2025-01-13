package interfaces.definitions;

public interface CanFly {
  // The compile will convert below to public abstract void fly(int speed);
  void fly(int speed);
  // The compile will convert below to public abstract void takeOff();
  abstract void takeOff();
  public abstract double dive();
}
