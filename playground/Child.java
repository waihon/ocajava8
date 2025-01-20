package playground;

public class Child extends Parent {
  public Child(int year) {
    super(year);
  }

  public Child() {
    this(1998);
  }

  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child.year);
  }
}
