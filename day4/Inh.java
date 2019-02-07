class First{
    public int sum(){
        return 5;
    }
    public void show(){
        System.out.println("Show from Class First..");
    }
    
}
class Second extends First{
    public int sum(){
        return 9;
    }
    public void display(){
        System.out.println("Display from Class Second..");
    }
}
public class Inh{
    public static void main(String[] args) {
        Second ob=new Second();
        ob.display();
        ob.show();
        System.out.println(ob.sum());
    }
}