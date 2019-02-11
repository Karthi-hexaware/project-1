/*import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
    public static void main(String[] args) {
        SortedSet<Employ> s = new TreeSet<Employ>();
        s.add(new Employ(1,"Karthiga",456446));
        s.add(new Employ(2, "arthi", 32446));
        s.add(new Employ(5, "raji", 78446));
        s.add(new Employ(3, "Karthi", 447746));
        for (Employ e : s) {
            System.out.println(e);
        }
    }//it not understanding on which field basic it has to be sorted
}//ClassCastException
*/

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
    public static void main(String[] args) {
        //Comparator c = new NameComparator();//sort by name
        Comparator d =new BasicComparator();//sort by basic
        SortedSet<Employ> s = new TreeSet<Employ>(d);
        s.add(new Employ(1, "Karthiga", 456446));
        s.add(new Employ(2, "Arthi", 324469));
        s.add(new Employ(5, "Raji", 78446));
        s.add(new Employ(3, "Karthi", 447746));
        for (Employ e : s) {
            System.out.println(e);
        }
    }
}

