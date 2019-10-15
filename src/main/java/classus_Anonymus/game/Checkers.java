package classus_Anonymus.game;

public class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    private Checkers(){}

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory(){
        public Game getGame(){return new Checkers();}
    };

}
