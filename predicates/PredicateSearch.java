package predicates;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    print(animals, a -> a.canHop());
  }

  private static void print(List<Animal> animals, Predicate<Animal> checker) {
    for (Animal animal : animals) {
      if (checker.test(animal)) {
        System.out.print(animal + " ");
      }
    }
    System.out.println();
  }

}
