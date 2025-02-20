package exceptions.print;

public class PrintException {

  public static void main(String[] args) {
    try {
      hop();
    } catch (Exception e) {
      System.out.println(e);
      // java.lang.RuntimeException: Cannot hop
    }
  }


  private static void hop() {
    throw new RuntimeException("Cannot hop");
  }

}
