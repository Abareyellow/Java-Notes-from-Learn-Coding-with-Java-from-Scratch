public class Arrays {
  public static void main(String[] args) {
    String[] players = {"Ronaldo", "Messai", "Salah"};
    int[] numbers = {7, 30, 11};

    // Accessing Array values
    System.out.println(players[0]);
    System.out.println(players[1]);
    System.out.println(players[2]);

    // Changing Array values
    players[0] = "Son";
    System.out.println(players[0]);

    // Number of item in an array
    System.out.println(players.length);

    for (int i = 0; i < players.length; i++) {
      System.out.println(players[i]);
    }

    for (String player : players) {
      System.out.println(player);
    }

    int[][] newMumbers = {{10, 20, 30}, {40, 50, 60}};
    int targetValue = newMumbers[1][2];

    System.out.println(targetValue);
  }
}