package methods;

public class Overloading {

  public static void main(String[] args) {
    Overloading ovl = new Overloading();
    ovl.fly(128);
    ovl.fly((short)168);
  }

  public void fly(int miles) {
    System.out.println("int: " + miles);
  }

  public void fly(short miles) {
    System.out.println("short: " + miles);
  }

}
