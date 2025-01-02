package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    System.out.println("Hopper:");
    print(animals, a -> a.canHop());
    System.out.println("Swimmer:");
    print(animals, (a) -> a.canSwim());
    System.out.println("Non-hopper:");
    print(animals, (Animal a) -> !a.canHop());
    System.out.println("Non-swimmer:");
    print(animals, (Animal a) -> { return !a.canSwim(); });

    boolean wantWhetherCanHop = true;
    print(animals, a -> a.canHop() == wantWhetherCanHop);
  }

  private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
      if (checker.test(animal)) {
        System.out.print(animal + " ");
      }
    }
    System.out.println();
  }
}
