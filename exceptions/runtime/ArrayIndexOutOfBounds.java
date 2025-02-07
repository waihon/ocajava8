package exceptions.runtime;

public class ArrayIndexOutOfBounds {
  public static void main(String[] args) {
    int[] countsOfCat = new int[5];
    // ArrayIndexOutOfBoundsException: 5
    System.out.println(countsOfCat[5]);
  }
}
