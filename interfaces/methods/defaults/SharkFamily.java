package interfaces.methods.defaults;

public interface SharkFamily {
  public default int getNumberOfFins() {
    return 8;
  }

  public double getLongestFinLength();

  public default boolean doFinsHaveScales() {
    return false;
  }
}
