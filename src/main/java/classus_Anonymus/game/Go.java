package classus_Anonymus.game;

public class Go implements Game {

    private int moves = 0;
    private static final int MOVES = 6;

    private Go(){}

    @Override
    public boolean move() {
        System.out.println("Go move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = Go::new;

}
