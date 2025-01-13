package interfaces.definitions;

private interface CanCrawl {  // Does not compile
  private void dig(int dept);  // Does not compile
  protected abstract double depth();  // Does not compile
  public final void surface();  // Does not compile
}
