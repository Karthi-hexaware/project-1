public class StaticDemo{
    public void show(){
        System.out.println("From your method..");
    }
    public static void display(){
        System.out.println("From Display Method..");
    }
    public static void main(String[] args) {
    StaticDemo.display();
    new StaticDemo().show();
    }
}