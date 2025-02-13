package exceptions.errors;

public class StackOverflow {

  public static void main(String[] args) {
    doNotCodeThis(1);
  }

  public static void doNotCodeThis(int num) {
    // Exception in thread "main" java.lang.StackOverflowError
    doNotCodeThis(num);
  }

}
