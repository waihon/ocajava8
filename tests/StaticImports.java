package tests;

import static statics.A.Type;
import static statics.B.Type;
import static statics.C.Type;
import static statics.D.Type;

public class StaticImports  {

  public static void main(String[] args) {
    System.out.println(statics.A.Type);
    statics.C.Type();
  }
}
