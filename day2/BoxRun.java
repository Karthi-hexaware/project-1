public class BoxRun{
    public void show(Object ob){
        String s=ob.getClass().getSimpleName();
        System.out.println(s);
        if(s.equals("Integer")){
            System.out.println("Integer Casting");
            int x=(Integer)ob;
        }
        if (s.equals("Double")) {
            System.out.println("Double Casting");
            double y = (Double) ob;
        }
    }
    public static void main(String[] args) {
        int x=12;
        double y=12.5;
        String name="Karthi";
        BoxRun obj=new BoxRun();
        obj.show(x);
        obj.show(y);
        obj.show(name);
    }
}
