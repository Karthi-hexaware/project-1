import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortStu{
    public static void main(String[] args) {
        //Comparator c =new CgpComparator();//sort by cgp
        Comparator c = new CityComparator();
        SortedSet<Student> s = new TreeSet<Student>(c);
        s.add(new Student(1,"Karthiga",7.4, "Madurai"));
        s.add(new Student(3, "Mohan", 8.4, "Rajapalayam"));
        s.add(new Student(5, "Kayal", 6.4, "Salem"));
        s.add(new Student(2, "Raji", 7.49, "Chennai"));
        for (Student e : s) {
            System.out.println(e);
        }
    }
}



