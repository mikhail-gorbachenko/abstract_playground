package classus_Anonymus;

public class Anonymus {
    public Anon anonymus(String dest, float price){
        return new Anon(){
            private int cost;
            { cost = Math.round(price);
            if(cost>100){
            System.out.println("Overdue!");}
            }
            private  String label = dest;
            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Anonymus an = new Anonymus();
        Anon a = an.anonymus("Dux" , 100.513f);
        Anon.main(new String[]{"s"});
    }

}


