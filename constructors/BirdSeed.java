package constructors;

public class BirdSeed {
  private int numberBags;
  boolean call;

  public BirdSeed() {
    // LINE 1
    this(2);
    call =  true;
    // LINE 2
  }

  public BirdSeed(int numberBags) {
    this.numberBags = numberBags;
  }

  public static void main(String[] args) {
    BirdSeed seed = new BirdSeed();
    System.out.println(seed.numberBags);
    System.out.println(seed.call);
  }
}
