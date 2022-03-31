class Main {
  public static void main(String[] args) {
    Player player01 = new Player("Schwarzenegger", 100, 10, 10);

    String playerStatus = player01.exibirStatus();
    System.out.println(playerStatus);
  }
}