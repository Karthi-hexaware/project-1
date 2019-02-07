//Abstract class with constructor
abstract class Employ{
    int empno;
    String name;
    double basic;
    public Employ(int empno,String name,double basic){
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }
    @Override
    public final String toString(){
        return "\nEmpno" +empno+ "\nName" +name+ "\nBasic" +basic;
    }
}
class Karthi extends Employ{
    public Karthi(int empno,String name,double basic){
        super(empno, name, basic);
    }
}

class Raji extends Employ {
    public Raji(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

class Jerry extends Employ {
    public Jerry(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}
public class AbsCon{
     public static void main(String[] args) {
         Employ[] obj  = new Employ[]{
             new Karthi(3,"Karthi",46465),
             new Raji(4,"Raji",5464650),
             new Jerry(5,"Jerry",465456)

         };
         for (Employ arr : obj) {
             System.out.println(arr);
         }
     }
}