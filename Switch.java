// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Switch {
  public static void main(String[] args) {
    // Switch - Case to make descisions
    int month = 5;

    switch (month) {
      case 1: 
        System.out.println("the first month");
        break;
      case 2:
        System.out.println("the second month");
        break;
      case 3:
        System.out.println("the third month");
        break;
      case 4:
        System.out.println("the fourth month");
        break;
      default:
        System.out.println("Out of range or something else!");
    }
  }
}