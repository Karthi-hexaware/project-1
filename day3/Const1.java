public class Const1{
    int a,b;
    public Const1(){
         a=8;
         b=9;
    }
    public Const1(int a){
        this.a=a;
        b=6;
    }
    public Const1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public final String toString(){
        return "A value" +a+ " B value" +b;
    }
    public static void main(String[] args) {
        //Const1 co=new Const1();
        //System.out.println(co);
        Const1 cot = new Const1(5,5);
        System.out.println(cot);
        Const1 cos = new Const1(45,23);
        System.out.println(cos.);
        
    }
}