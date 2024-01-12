// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Input {
  public static void main(String[] args) {
    Scanner newObj = new Scanner(System.in);
    String name;

    // Take input from user
    System.out.println("Type your name and your number: ");
    name = newObj.nextLine();

    // Numerical input from user
    int numEntered = newObj.nextInt();

    // Printing the result
    System.out.println("Your name is: " + name + " and your  number is " + numEntered);
  }
}