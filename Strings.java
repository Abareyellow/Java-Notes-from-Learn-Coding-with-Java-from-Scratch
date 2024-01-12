// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Strings {
  public static void main(String[] args) {
    String fullMessage = "Hi, Welcome to Java";

    // Get the fullMessage Length
    System.out.println("The length of the fullMessage is: " + fullMessage.length());

    // To Upper Case
    System.out.println("The fullMessage in Upper Case is: " + fullMessage.toUpperCase());

    // To Lower Case
    System.out.println("The fullMessage in Lower Case is: " + fullMessage.toLowerCase());

    // Want the character W Position>
    System.out.println(fullMessage.indexOf("W"));

    // Combine Strings(Concatenation)
    String firstMessage = "Hello and Welcome ";
    String secondMessage = "to the Java Programming Language";

    System.out.println(firstMessage + secondMessage);
    System.out.println(firstMessage.concat(secondMessage));
  }
}