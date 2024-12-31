package loops;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
  public static void main(String[] args) {
    stringArray();
    stringList();
    stringListIterator();
  }

  static void stringArray() {
    final String[] names = new String[3];
    names[0] = "Lisa";
    names[1] = "Kevin";
    names[2] = "Roger";
    for (String name : names) {
      System.out.print(name + ", ");
    }
    System.out.println();
  }

  static void stringList() {
    List<String> values = new ArrayList<String>();
    values.add("Lisa");
    values.add("Kevin");
    values.add("Roger");
    for (String value : values) {
      System.out.print(value + ", ");
    }
    System.out.println();
  }

  static void stringListIterator() {
    List<String> values = new ArrayList<String>();
    values.add("Lisa");
    values.add("Kevin");
    values.add("Roger");
    for (Iterator<String> i = values.iterator(); i.hasNext(); ) {
      String value = i.next();
      System.out.print(value + ", ");
    }
    System.out.println();
  }
}
