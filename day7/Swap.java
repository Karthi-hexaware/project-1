//Generic example(for all datatypes)
//which use angular bracket "<>"
//give some character r String inside the <> for further use.
//this shows reuse of method
class Data <He> {
    public void swap(He a, He b) {
        He t =a;
        a = b;
        b = t;
        System.out.println("A value: " +a + " B value: " +b);
    }
}
public class Swap {
    public static void main(String[] args) {
        new Data().swap(23.8f,45.6f);
        new Data().swap(23, 45);
        new Data().swap(23., 45.6f);
        new Data().swap("karthi", 45.6f);
    }
}