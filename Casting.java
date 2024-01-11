public class Casting {
  public static void main(String[] args) {
    // Data Types in Java
    //int newTemp = 30;
    //double newDeciamlTemp = newTemp;

    double newDecimalTemp = 19.57d;
    int newTemp = (int) newDecimalTemp;

    System.out.println(newTemp);
    System.out.println(newDecimalTemp);
  }
}