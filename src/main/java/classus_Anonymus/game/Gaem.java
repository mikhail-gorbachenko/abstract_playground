package classus_Anonymus.game;

public class Gaem {

    public static void playGame(GameFactory factory){
        Game gaem = factory.getGame();
        while(gaem.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
        playGame(Go.factory);
    }

}
