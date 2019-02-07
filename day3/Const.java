public class Const{
    static{
       System.out.println("Static Constructour");
    }
    Const(){
        System.out.println("General Constructor");
    }
    public static void main(String[] args) {
        Const cs=new Const();
    }
}