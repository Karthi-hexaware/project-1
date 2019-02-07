//purpose of hash code
import java.util.Objects;
public class Employee{
    int empno;
    String name;
    double basic;
    public final int hashCode(){
        return Objects.hash(empno,name,basic);
    }
    public final String toString(){
        return "Empno:" +empno + " Name:" +name + " Basic:" +basic;
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.empno=1;
        e1.name="Karthiga";
        e1.basic=45631;
        e2.empno=1;
        e2.name="Karthiga";
        e2.basic=45631;
        System.out.println(e1);// once object is displayed toString is automaticaly call
        System.out.println(e2);
       System.out.println(e1.hashCode());
       System.out.println(e2.hashCode());


    }
}