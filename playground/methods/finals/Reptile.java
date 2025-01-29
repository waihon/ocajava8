package playground.methods.finals;

public class Reptile {

  public final void layEggs() {
    System.out.println("Reptile laying eggs");
  }

  public static void main(String[] args) {
    Reptile reptile = new Lizard();
    reptile.layEggs();
  }

}
