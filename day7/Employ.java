//collections
/*import java.util.SortedSet;
import java.util.TreeSet;
public class SortDemo {
    public static void main(String[] args) {
        SortedSet s =new TreeSet();
        s.add("Karthiga");
        s.add("Raji");
        s.add("Ramya");
        s.add("Krishna");
        s.add("Divya");
        for (Object ob : s) {
            System.out.println(ob);
        }
    }
}*/
public class Employ {
    int empno;
    String name;
    double basic;

    public Employ() {
    }

    public Employ (int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public final String toString() {
        return "Empno: " +empno + " Name: " +name + " Basic:" +basic;
    }
}