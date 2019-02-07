public class Employ{
    int empno;
    String name;
    double basic;
    public final String toString(){
         return "Empno:" +empno +" Name:" +name +" Basic:"  +basic;
    }
    public static void main(String[] args){
        Employ e1=new Employ();
        e1.empno=1;
        e1.name="Karthi";
        e1.basic=53655;
        Employ e2=new Employ();
        e2.empno = 2;
        e2.name = "Karthir";
        e2.basic = 42555;
        Employ e3 = new Employ();
        e3.empno = 3;
        e3.name = "arthi";
        e3.basic = 42000;
        Employ[] arr=new Employ[]{e1,e2,e3};
        for(Employ e: arr){
            //System.out.println(e.empno+ " "+e.name+" "+e.basic);
            System.out.println(e);
        }
    }
}