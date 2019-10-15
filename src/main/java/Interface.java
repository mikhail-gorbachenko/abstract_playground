public interface Interface {
    void hug();
    class Hugger implements Interface{

        @Override
        public void hug() {
            System.out.println("Hug!");
        }

        public static void main(String[] args) {
            new Hugger().hug();
        }
    }
}
