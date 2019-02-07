//if base class and derived class both have same methods,if you want to call method in base class then use super keyword
//super as a keyword
//super as a constructor
class Demo1 {
    public void show(){
        System.out.println("Show from Demo1.");
    }
}
class Demo2 extends Demo1 {
    public void show(){
        super.show();//bcoz here object is created for derived class
        System.out.println("Show from Demo2..");
    }

}
public class Super {
    public static void main(String[] args) {
        Demo2 ob=new Demo2();
        ob.show();
    }
}