public class Object { 
  public static void main(String[] args) {
    NewDemo newObj = new NewDemo(20, "Jim");
    NewDemo newObj2 = new NewDemo(23, "Katie");


    System.out.println(newObj.valueEntered);
    System.out.println(newObj2.valueEntered);
    System.out.println(newObj.newText);
    System.out.println(newObj2.newText);
  }
}