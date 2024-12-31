package statics;

//import static java.util.Arrays;  // Do not compile
import static java.util.Arrays.asList;
//static import java.util.Arrays.*;  // Do not compile

public class StaticImports  {
  private static String name = "Static class";

  public static void first() {
    System.out.println(name);
  }

  public void second() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    first();
    //second();
    asList("one");
    //Arrays.asList("two"); // Do not compile
  }
}
