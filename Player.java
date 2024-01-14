class Player {
  protected String name = "Player-Parent";
  
  public void newMessage() {
    System.out.println("This is the Player message");
  }
}

class NewPlayer extends Player {
  private String playername = "Player-Child";

  public static void main(String[] args) {
    NewPlayer newSkilledPlayer =  new NewPlayer();
    newSkilledPlayer.newMessage();
    System.out.println(newSkilledPlayer.name + " " + newSkilledPlayer.playername);;
  }
}