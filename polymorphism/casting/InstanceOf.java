package polymorphism.casting;

import polymorphism.*;

public class InstanceOf{
  public static void main(String[] args) {
    Primate primate = new Primate();
    if (primate instanceof Lemur) {
      Lemur lemur = (Lemur)primate;
      System.out.println(lemur.age);
    } else {
      System.out.println("Primate is not a Lemur");
    }
  }
}
