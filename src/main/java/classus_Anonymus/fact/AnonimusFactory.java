package classus_Anonymus.fact;

public class AnonimusFactory {

    public static void serviceConsumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
        serviceConsumer(Implementation3.factory);
    }
}
