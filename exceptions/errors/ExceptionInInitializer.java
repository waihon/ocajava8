package exceptions.errors;

public class ExceptionInInitializer {
  static {
    int[] countsOfMoose = new int[3];
    // Caused by: ArrayIndexOutOfBoundsException
    int num = countsOfMoose[-1];
  }

  public static void main(String[] args) {
  }
}
