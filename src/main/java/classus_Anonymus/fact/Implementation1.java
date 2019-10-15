package classus_Anonymus.fact;

public class Implementation1 implements Service {
    private Implementation1(){}

    @Override
    public void method1() {
        System.out.println("Imp1met1");
    }

    @Override
    public void method2() {
        System.out.println("Imp1met2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}
