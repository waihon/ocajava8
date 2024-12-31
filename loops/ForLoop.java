package loops;

public class ForLoop {
  public static void main(String[] args) {
    int x = 0;
    // Java 8: error: variable x is already defined in method main(String[])
    // Java 11: error: variable x is already defined in method main(String[])
    for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
      System.out.print(x + " ");
    }
    // System.out.println(x);
  }
}
