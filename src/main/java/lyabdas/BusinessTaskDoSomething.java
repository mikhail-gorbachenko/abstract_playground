package lyabdas;

public class BusinessTaskDoSomething extends Thread implements BusinessTask {

    @Override
    public void run(){
        try {
            updateStateInDB();
            sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateStateInDB() {
        System.out.println("We are update state in DB");
    }
}
