package arrays;

public class ArrayType {
  public static void main(String[] args) {
    String[] bugs = { "cricket", "beetle", "ladybug" };
    String[] alias = bugs;
    String[] bugsArray = { "cricket", "beetle", "ladybug" };
    System.out.println(bugs.equals(alias));      // true
    System.out.println(bugs.toString());         // [Ljava.lang.String;@15db9742
    System.out.println(bugs.equals(bugsArray));  // false
  }
}
