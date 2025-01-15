package interfaces.multiple;

public class Bear implements Herbivore, Omnivore{

  // The signatures for the tow interface methods eatPlants() are compatible,
  // so we can define a class that fulfills both interfaces simultaneously.
  public int eatPlants() {
    System.out.println("Eating plants");
    return 1;
  }

  public void eatMeat() {
    System.out.println("Eating meat");
  }

  public void drinkWater() {
    System.out.println("Drinking water");
  }

  public void drinkWater(double quantity) {
    System.out.println("Drinking " + quantity + " liters of water");
  }

  public static void main(String[] args) {
    Bear bear = new Bear();
    int flag = bear.eatPlants();
    System.out.println("Flag: " + flag);
    bear.eatMeat();
    bear.drinkWater();
    bear.drinkWater(1.68);
  }
}
