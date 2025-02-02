package exceptions.tryfinally;

public class SmartGirl {
  public static void main(String[] args) {
    new SmartGirl().explore();
  }

  void explore() {
    try {
      seeAnimals();
      fall();
      System.out.println("Never get here");
    } finally {
      seeMoreAnimals();
    }
  }

  void fall() {
    throw new RuntimeException();
  }

  void seeAnimals() {
    System.out.println("See animals");
  }

  void seeMoreAnimals() {
    System.out.println("See more animals");
  }
}
