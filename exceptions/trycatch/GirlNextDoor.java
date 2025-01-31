package exceptions.trycatch;

public class GirlNextDoor {
  public static void main(String[] args) {
    new GirlNextDoor().explore();
  }

  void explore() {
    // Braces are missing
    try
      fall();
    catch (RuntimeException e)
      getUp();

    seeAnimals();
  }

  void fall() {
    throw new RuntimeException();
  }

  void getUp() {
    System.out.println("Get up");
  }

  void seeAnimals() {
    System.out.println("See animals");
  }
}
