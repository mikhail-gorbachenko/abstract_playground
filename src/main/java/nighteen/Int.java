package nighteen;

public interface Int {
    int unteger();
    String strung();

    class Impl{
        public static void ingo(Int inturface){
            System.out.println(inturface.unteger());
            System.out.println(inturface.strung());
        }
    }
}
