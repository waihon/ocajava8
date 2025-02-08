package exceptions.runtime;

public class IllegalArgument {
  private static int numberEggs;

  public static void main(String[] args) {
    // IllegalArugmentException: Number of eggs must not be negative
    setNumberEggs(-1);
    System.out.println(numberEggs);
  }

  public static void setNumberEggs(int numberEggs) {
    if (numberEggs < 0) {
      throw new IllegalArgumentException(
        "Number of eggs must not be negative");
    }
    IllegalArgument.numberEggs = numberEggs;
  }
}
