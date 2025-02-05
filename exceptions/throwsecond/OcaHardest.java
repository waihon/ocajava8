package exceptions.throwsecond;

public class OcaHardest {

  public static void main(String[] args) {
    System.out.println(new OcaHardest().exceptions());
  }

  public String exceptions() {
    String result = "";
    String v = null;

    try {
      try {
        result += "before ";  // "before "
        v.length();           // NullPointerException
        result += "after ";   // not reached
      } catch (NullPointerException e) {
        result += "catch ";   // "before catch "
        throw new RuntimeException();
      } finally {
        result += "finally "; // "before catch finally"
        throw new Exception();
      }
    } catch (Exception e) {
      result += "done ";      // "before catch finally done "
    }

    return result;            // "before catch finally done "
  }

}
