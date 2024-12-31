package packages;

import java.util.Date;
import java.sql.Date;

public class Animal {
  private String name;
  private Date date;

  public Animal() {
    this("Doggie");
  }

  public Animal(String name) {
    this.name = name;
  }
  public static void main(String[] args) {
    Animal dog = new Animal();
    System.out.println("Hello, " + dog.name);
  }

}

class Animal2 {

}