//super as a constructor(to send value from derived class from base class)
class Employ{
    int empno;
    String name;
    double basic;

    public Employ(int empno,String name,double basic){
       this.empno=empno;
       this.name=name;
       this.basic=basic;
    }
    public final String toString(){
    return "Empno:"+empno+"\nName:"+name+"\nBasic:"+basic;
    }
}
class Detail extends Employ{
    public Detail(int empno,String name,double basic){
        super(empno,name,basic);
    }
}
public class SuperDemo{
    public static void main(String[] args) {
        Employ ob=new Detail(1,"karthiga",46456);//base class can hold derived class object method
        System.out.println(ob);

    }
}