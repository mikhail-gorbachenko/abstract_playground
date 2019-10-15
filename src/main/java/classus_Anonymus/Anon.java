package classus_Anonymus;

public class Anon {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public ContentsToo contentsToo(int x){
        return new ContentsToo(x){
        };
    }

    public Contents contentsThree(String x){ //значит с восьмой версии можно не укаывать как final
        return new Contents(){
            private String y = x;
            public String ready(){
                return y;
            }
        };
    }

    public static void main(String[] args) {
        Anon p = new Anon();
        Contents c = p.contents();
        ContentsToo c2 = p.contentsToo(10);
        Contents c3 = p.contentsThree("strung");
        ContentsThree c4 = getBase(42);
        c4.func();
    }

    class Contents{

    }

    class ContentsToo{

        int x;

        ContentsToo(int x){
            this.x = x;
        }

    }

    abstract static class ContentsThree{
        public ContentsThree(int i){
            System.out.println("Base constructor " + i);
        }

        public abstract void func();
    }

    public static ContentsThree getBase(int i){
        return new ContentsThree(i){
            {System.out.println("Create new");}
            public void func(){
                System.out.println("functius anonymus");
            }
        };
    }
}
