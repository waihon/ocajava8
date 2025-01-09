package inheritance.members.calls;

public class Shark extends Fish {

  private int numberOfFins = 8;

  public Shark(int age) {
    super(age);
    this.size = 4;
  }

  public void displayDetailsWithoutThisNorSuper() {
    System.out.print("Shark with age: " + getAge());
    System.out.print(" and " + size + " meters long");
    System.out.println(" with " + numberOfFins + " fins.");
  }

  public void displayDetailsWithThis() {
    System.out.print("Shark with age: " + this.getAge());
    System.out.print(" and " + this.size + " meters long");
    System.out.println(" with " + this.numberOfFins + " fins.");
  }

  public void displayDetailsWithThisOrSuper() {
    System.out.print("Shark with age: " + super.getAge());
    System.out.print(" and " + super.size + " meters long");
    System.out.println(" with " + this.numberOfFins + " fins.");
  }

  public static void main(String[] args) {
    Shark shark = new Shark(2);
    shark.displayDetailsWithoutThisNorSuper();
    shark.displayDetailsWithThis();
    shark.displayDetailsWithThisOrSuper();
  }
}
