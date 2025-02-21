package exceptions.print;

public class PrintMessage {

  public static void main(String[] args) {
    try {
      hop();
    } catch (Exception e) {
      System.out.println(e.getMessage()); // Cannot hop
    }
  }


  private static void hop() {
    throw new RuntimeException("Cannot hop");
  }

}
