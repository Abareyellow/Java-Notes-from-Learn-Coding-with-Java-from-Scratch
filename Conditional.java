
// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Conditional {
  public static void main(String[] args) {
    // Conditional Statements
    int firstValue = 30;
    int secondValue = 26;

    if (firstValue < secondValue) {
      System.out.println("The second value is the biggest");
    } else if (firstValue > secondValue) {
      System.out.println("The first value is greater than the second value");
    } else {
      System.out.println("Both values are equal to each other");
    }

    String testingResult = (firstValue < secondValue) ? "The second value is the biggest" : "The first value is greater";

    System.out.println(testingResult);
  }
}