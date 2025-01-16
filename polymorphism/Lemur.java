package polymorphism;

public class Lemur extends Primate implements HasTail {
  public int age = 10;

  public boolean isTailStriped() {
    return false;
  }

  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);

    HasTail hasTail = lemur;
    System.out.println(hasTail.isTailStriped());
    // Does not compile
    //System.out.println(hasTail.age);

    Primate primate = lemur;
    System.out.println(primate.hasHair());
    // Does not compile
    //System.out.println(primate.isTailStriped());
  }

}
