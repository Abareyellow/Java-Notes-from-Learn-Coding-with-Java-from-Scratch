// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
public class Maths {
  public static void main(String[] args) {
    // Get the largest value
    int maxValue = Math.max(30, 70);
    System.out.println(maxValue);
    // Get the smallest value
    int minValue = Math.min(30, 70);
    System.out.println(minValue);
    // round a number
    double roundValue = Math.round(19.57d);
    System.out.println(roundValue);
    // Round float up to the nearest int
    double newCeil = Math.ceil(10.343);
    System.out.println(newCeil);
    // Round float down to the nearest int
    double newFloor = Math.floor(10.343);
    System.out.println(newFloor);
    // Get the absolute value
    double newAbs = Math.abs(-10.343);
    System.out.println(newAbs);
    // Get the squareroot
    double newSqrt = Math.sqrt(64);
    System.out.println(newSqrt);
    // Generater random number
    double newRandom = Math.random();
    int newRand2 = (int) (Math.random() * 101);
    System.out.println(newRand2);
  }
}