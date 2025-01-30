package playground.methods.hidden;

public class Pelican extends Bird {
  protected void fly() {
    System.out.println("Pelican is flying");
  }

  public static void main (String[] args) {
    Pelican pelican = new Pelican();
    pelican.fly();
  }
}
