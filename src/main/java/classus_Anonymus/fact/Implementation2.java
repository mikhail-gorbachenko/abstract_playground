package classus_Anonymus.fact;

public class Implementation2 implements Service{
    private Implementation2(){}

    @Override
    public void method1() {
        System.out.println("imp2met1");
    }

    @Override
    public void method2() {
        System.out.println("imp2met2");
    }

    public static ServiceFactory factory = ()->new Implementation2();
}
