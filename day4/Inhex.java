class C1{
    static{
        System.out.println("Static from c1..");
    }
    public C1(){
        System.out.println("Base Class Constructor..");
    }
}
class C2 extends C1{
    static{
        System.out.println("Static from c2");
    }
    public C2(){
        System.out.println("Derived Class Constructor...");
    }
}
public class Inhex{
    public static void main(String[] args){
        C2 ob=new C2();
    }
}