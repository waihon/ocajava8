package exceptions.varioustypes;

public class SmartGirl {
  public static void main(String[] args) {
    new SmartGirl().visitPorcupine();
    new SmartGirl().visitMonkeys();
    new SmartGirl().visitSnakes();
  }

  public void visitPorcupine() {
    try {
      seeAnimal();
    } catch (AnimalOutForWalk e) { // first catch block
      System.out.println("Porcupine - Try back later");
    } catch (ExhibitClosed e) { // second catch block
      System.out.println("Porcupine - Not today");
    }
  }

  public void visitMonkeys() {
    try {
      seeAnimal();
    } catch (ExhibitClosedForLunch e) { // first catch block
      System.out.println("Monkeys - Try back later");
    } catch (ExhibitClosed e) { // second catch block
      System.out.println("Monkeys - Not today");
    }
  }

  public void visitSnakes() {
    try {
      seeAnimal();
    } catch (ExhibitClosedForLunch e) { // first catch block
      System.out.println("Snakes - Try back later");
    } catch (ExhibitClosed e) { // second catch block
      System.out.println("Snakes - Not today");
    } catch (RuntimeException e) { // third exception
      System.out.println("Snakes - Runtime exception");
    } catch (Exception e) { // forth exception
      System.out.println("Snakes - Exception");
    }
  }

  private void seeAnimal() {
    throw new ExhibitClosed();
  }
}
