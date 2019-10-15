package classus_Anonymus;


public class Implementation3 implements Service {
    private Implementation3(){}

    @Override
    public void method1() {
        System.out.println("imp3met1");
    }

    @Override
    public void method2() {
        System.out.println("imp3met2");
    }

    public static ServiceFactory factory = Implementation3::new;
}
