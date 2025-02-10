package exceptions.runtime;

public class NullPointer {
  private static String name;
  public static void main(String[] args) {
    // Runtime exception: NullPointerException
    printLength();
  }

  public static void printLength() throws NullPointerException {
    System.out.println(name.length());
  }
}
