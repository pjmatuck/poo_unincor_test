class Main {
  public static void main(String[] args) {
    /*
    * 1. Instanciar um Player
    * 2. Instanciar arma
    * 3. Atribuir objeto arma ao player
    * 4. Criar objeto monstro
    * 5. Fazer o monstro receber o dano causado pelo player
    *    até morrer.
    */
    //Passo 2
    Arma plasma = new Arma(0, 30);
    //Passo 1
    Player player = new Player("Shwarznegger", 100, 0f, 0f, 10, plasma); //Passo 3 (Arma no construtor do player)
    //Passo 4 (monstro não tem construtor que recebe parametros)
    Monstro alien = new Monstro();
    alien.nome = "Alien";
    alien.forca = 40;
    alien.pontosDeVida = 400;

    //Passo 5
    int danoDoPlayer = player.causarDano();
    while(alien.pontosDeVida > 0){                  
      alien.receberDano(danoDoPlayer);
      System.out.println("Vida do monstro: " +       
                         alien.pontosDeVida);
    }
  }
}