package exceptions.systemexit;

public class SmartGirl {
  public static void main(String[] args) {
    new SmartGirl().explore();
  }

  void explore() {
    try {
      seeAnimals();
      // When System.exit is called in the try or catch block,
      // finally does not run.
      System.exit(0);
      fall();
    } catch (RuntimeException e) {
      getHugFromDaddy();
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
