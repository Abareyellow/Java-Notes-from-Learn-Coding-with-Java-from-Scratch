public class Operator {
  public static void main(String[] args) {
    // Artimetic Operators in Java
    int firstValue = 100;
    int secondValue = 25;

    System.out.println(firstValue + secondValue);
    System.out.println(firstValue - secondValue);
    System.out.println(firstValue * secondValue);
    System.out.println(firstValue / secondValue);
    System.out.println(firstValue % secondValue);
    System.out.println(firstValue++);
    System.out.println(firstValue--);

    // Assignment Operators in Java
    firstValue += 20;
    secondValue -= 10;
    System.out.println(firstValue);
    System.out.println(secondValue);

    // Comparsion Operators in Java
    System.out.println(firstValue == secondValue);
    System.out.println(firstValue != secondValue);
    System.out.println(firstValue > secondValue);
    System.out.println(firstValue < secondValue);
    System.out.println(firstValue >= secondValue);
    System.out.println(firstValue <= secondValue);

    // Logical Operators in Java
    System.out.println(firstValue < 70 && secondValue < 50);
    System.out.println(firstValue < 70 || secondValue < 50);
  }
}