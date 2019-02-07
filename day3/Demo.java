

public class Demo{
    public void show(int x){
        System.out.println("Show method Int " +x);
    }
    public void show(double x){
        System.out.println("Show method Double " +x);
    }
    public void show(String x){
        System.out.println("Show method String" +x);
    }
    public void show(boolean x){
        System.out.println("Show method Boolean " +x);
    }
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.show(12);
        ob.show(true);
        ob.show(52.98);
        ob.show("Karthi");
    }

}