package lyabdas;

public interface BusinessTask {
    void updateStateInDB();

    default void updateStateInMemory(){
        System.out.println("WRYYYYYYYYY!");
    }
}
