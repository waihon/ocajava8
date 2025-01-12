package inheritance.variables.hiding;

public class JellyFish extends Animal {
  public int length = 5;

  public static void main(String[] args) {
    JellyFish jellyFish = new JellyFish();
    System.out.println(jellyFish.length);  // 5

    Animal animal = new JellyFish();
    System.out.println(animal.length);  // 2
  }

}
