public class Methods {
  static void newGreeting(String name, int numEntered) {
    System.out.println("Hello and welcome to " + name + " in " + numEntered + " years!");
  }

  static int multiply(int x, int y) {
    return x * y;
  }

  public static void main(String[] args) {
    newGreeting("Java", 2);
    newGreeting("Python", 3);
    newGreeting("JavaScript", 4);
    int result = multiply(2, 3);
    System.out.println(result);
    System.out.println(multiply(5, 6));
    System.out.println(multiply(8, 9)); 
  }
}