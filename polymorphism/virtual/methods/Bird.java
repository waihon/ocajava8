package polymorphism.virtual.methods;

public class Bird {
  public String getName() {
    return "Unknown";
  }

  public void displayInformation() {
    System.out.println("The bird name is: " + getName());
  }

  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.displayInformation();  // Unknown
  }
}
