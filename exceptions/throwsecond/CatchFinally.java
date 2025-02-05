package exceptions.throwsecond;

public class CatchFinally {
  public static void main(String[] args) {
    new CatchFinally().throwSecond();
  }

  public void throwSecond() {
    try {
      throw new RuntimeException("try");
    } catch (RuntimeException e) {
      throw new RuntimeException("catch");
    } finally {
      // Since the finally block throws an exception of its own,
      // this one gets thrown instead of that in catch block.
      throw new RuntimeException("finally");
    }
  }
}
