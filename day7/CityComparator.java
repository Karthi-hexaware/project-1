import java.util.Comparator;

public class CityComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.city.compareTo(s2.city);
    }
}