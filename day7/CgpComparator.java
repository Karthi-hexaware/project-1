import java.util.Comparator;

public class CgpComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.cgp <= s2.cgp) {
            return -1;
        } else {
            return 1;
        }
    }
}