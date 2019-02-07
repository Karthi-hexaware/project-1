//typecasting
class Demo1{
    public void show(){
        System.out.println("demo1");
    }
}
class Demo2 extends Demo1{
    public void show(){
        System.out.println("demo2");
    }
}
public class Sam{
    public static void main(String[] args) {
        Demo1 t=new Demo1();
        Demo1 obj=new Demo2();
        obj.show();
        Demo2 obj1=new Demo2();
        obj1.show();
        Demo1 obj3=(Demo1)new Demo2();
        obj3.show();
        Demo1 xy=(Demo1)t;
        xy.show();
        Demo2 yz=(Demo1)xy;//incompatible error
        yz.show();
    }
}