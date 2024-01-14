// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

enum Month {
  January,
  Februrary,
  March,
  April
}

public class Main { 
  public static void main(String[] args) {
    Month newVar = Month.March;
    //System.out.println(newVar);

    switch (newVar) {
      case January:
        System.out.println("January");
        break;
      case Februrary:
        System.out.println("Februrary");
        break;
      case March:
        System.out.println("March");
        break;
      case April:
        System.out.println("April");
        break;
    }
  }
}