// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Loops {
  public static void main(String[] args) {
    int valueEntered = 10;

    while (valueEntered < 28) {
      System.out.println(valueEntered);
      valueEntered += 2;
    }

    int valueEntered2 = 10;

    do {
      System.out.println(valueEntered2);
      valueEntered2 += 2;
    } 
    while (valueEntered2 < 28);

    for (int i = 0; i <= 18; i += 2) {
      System.out.println(i);
    }
  }
}