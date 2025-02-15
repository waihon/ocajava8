package exceptions.callmethods;

public class Bunny {

  private static int carrotCount = 1;

  public static void main(String[] args) {
    try {
      eatCarrotWithExceptionDeclaration();
    } catch (NoMoreCarrotsException e) {
      System.out.println("No more carrot!");
    }

    eatCarrotWithExceptionHandling();
  }

  public static void eatCarrotWithExceptionDeclaration()
    throws NoMoreCarrotsException {

    eatCarrot();

  }

  public static void eatCarrotWithExceptionHandling() {

    try {
      eatCarrot();
    } catch (NoMoreCarrotsException e) {
      System.out.println("No more carrot!");
    }

  }

  private static void eatCarrot() throws NoMoreCarrotsException {

    if (carrotCount < 1) {
      throw new NoMoreCarrotsException();
    }

    carrotCount--;
    System.out.println("A bunny is eating carrot.");

  }
}
