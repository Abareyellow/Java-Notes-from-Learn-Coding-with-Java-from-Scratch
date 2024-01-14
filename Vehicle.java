//Create Interface
interface Vehicle {
  public void vehicleMessage();
  public void vehicleColor();
}

class Car implements Vehicle {
  public void vehicleMessage() {
    System.out.println("This is a car");
  }

  public void vehicleColor() {
    System.out.println("The vehicle color is red");
  }
}