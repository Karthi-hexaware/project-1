public class Demo1{
    public int sum(){
        return 5;
    }
    public int sum(int x,int y){
        return x+y;
    }
    public int sum(int x,double y){
        return x+5;
    }
    public static void main(String[] args) {
        Demo1 ob=new Demo1();
        System.out.println("Result:" +ob.sum());
        System.out.println("Result:" +ob.sum(5,6));
        System.out.println("Result:" +ob.sum(5,66.9));
    }
}