package exceptions.trycatchfinally;

public class GirlNextDoor {
  public static void main(String[] args) {
    new GirlNextDoor().explore();
  }

  void explore() {
    try {
      seeAnimals();
      fall();
      System.out.println("Never get here");
    } finally {
      seeMoreAnimals();
    // Wrong order: catch without try
    } catch (RuntimeException e) {
      getHugFromDaddy();
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
