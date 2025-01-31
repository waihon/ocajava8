package exceptions.trycatch;

public class SmartGirl {
  public static void main(String[] args) {
    new SmartGirl().explore();
  }

  void explore() {
    try {
      fall();
      System.out.println("Never get here");
    } catch (RuntimeException e) {
      getUp();
    }
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
