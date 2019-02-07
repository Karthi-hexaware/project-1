//ArrayListExample
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List lstName = new ArrayList();
        lstName.add("Karthi");
        lstName.add("Raji");
        lstName.add("Soni");
        lstName.add("Jerry");
        lstName.add("Archu");
        System.out.println("Elements of ArrayList are :");
        for (Object ob : lstName) {
            System.out.println(ob);
        }
        lstName.set(2,"Kanaka");
        System.out.println("\nList after adding new Element");
        for (Object ob : lstName) {
            System.out.println(ob);
        }
        lstName.set(2,"Lakshmi");
        System.out.println("List after Modify element");
        for (Object ob : lstName) {
            System.out.println(ob);
        }
        lstName.remove(0);
        System.out.println("\nList after removing by Element Index");
        for (Object ob : lstName) {
            System.out.println(ob);
        }
        System.out.println("\nList after Removing by Element Name");
        lstName.remove("Renu");
        for (Object ob : lstName) {
            System.out.println(ob);
        }
    }
}