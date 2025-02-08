package exceptions.runtime;

public class ClassCast {
  public static void main(String[] args) {
    String str = "moose";
    // Compilation error: incompatible types: String cannot be converted to Integer
    //Integer number = (Integer)str;
    Object obj = str;
    // Runtime exception: ClassCastException: String cannot be cast to Integer
    Integer number = (Integer)obj;
    System.out.println(number);
  }
}
