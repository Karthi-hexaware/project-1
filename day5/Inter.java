//Interface example
interface IOne{
    default void display(){
        System.out.println("Display from IOne");
    }
}
interface ITwo{
    default void display(){
        System.out.println("Display from ITwo");
    }
}
interface IThree{
     default void display(){
         System.out.println("Display from IThree");
     }
}
class Demo implements IOne,ITwo,IThree{
    public void display() {
        IOne.super.display();
        ITwo.super.display();
        IThree.super.display();
    }

}

public class Inter{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.display();
    }

}