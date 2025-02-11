package exceptions.runtime;

public class NumberFormat {
  public static void main(String[] args) {
    // NumberFormatException: For input string: "eight"
    Integer.parseInt("eight");
  }
}
