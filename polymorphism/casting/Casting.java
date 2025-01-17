package polymorphism.casting;

import polymorphism.*;

public class Casting {
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);

    HasTail hasTail = lemur;
    System.out.println(hasTail.isTailStriped());

    // 1. Casting an object from a subclass to a superclass doesn't require an explicit cast.
    Primate primate = lemur;
    System.out.println(primate.hasHair());

    // 2. Casting an object from a superclass to a subclass requires an explicit cast.
    // Does not compile
    //Lemur lemur2 = primate;
    Lemur lemur3 = (Lemur)primate;
    System.out.println(lemur3.age);

    // 3. The compiler will not allow casts to unrelated types.
    // Does not compile
    //String str = (String)lemur;

    // 4. An exception may be thrown at runtime if the object being cast is not
    // actually an instance of that class.
    Primate primate2 = new Primate();
    Lemur lemur4 = (Lemur)primate2;  // Throws CLassCastException at runtime
    System.out.println(lemur4.age);
  }
}
