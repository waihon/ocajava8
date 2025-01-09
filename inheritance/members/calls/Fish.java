package inheritance.members.calls;

class Fish {
  protected int size;
  private int age;

  public Fish(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public static void main(String[] args) {
    System.out.println("Fish");
  }
}
