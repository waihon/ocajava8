package exceptions.systemexit;

public class GirlNextDoor {
  public static void main(String[] args) {
    new GirlNextDoor().explore();
  }

  void explore() {
    try {
      seeAnimals();
      fall();
    } catch (RuntimeException e) {
      getHugFromDaddy();
      // When System.exit is called in the try or catch block,
      // finally does not run.
      System.exit(1);
    } finally {
      seeMoreAnimals();
    }
  }

  void fall() {
    throw new RuntimeException();
  }

  void getHugFromDaddy() {
    System.out.println("Get hug from daddy");
  }

  void seeAnimals() {
    System.out.println("See animals");
  }

  void seeMoreAnimals() {
    System.out.println("See more animals");
  }
}
