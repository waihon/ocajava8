package exceptions.print;

public class PrintStackTrace {

  public static void main(String[] args) {
    try {
      hop();
    } catch (Exception e) {
      e.printStackTrace();
      // java.lang.RuntimeException: Cannot hop
      //         at exceptions.print.PrintStackTrace.hop(PrintStackTrace.java:17)
      //         at exceptions.print.PrintStackTrace.main(PrintStackTrace.java:7)
    }
  }

  private static void hop() {
    throw new RuntimeException("Cannot hop");
  }

}
