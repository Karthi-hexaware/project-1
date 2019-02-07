//refer Employ.java
import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {

    public static void main(String[] args) {
        List lstEmploy = new ArrayList();
        lstEmploy.add(new Employ(1, "Karthi", 45646));
        lstEmploy.add(new Employ(2, "Raji", 465464));
        lstEmploy.add(new Employ(3, "Soni", 65464));
        lstEmploy.add(new Employ(4, "Kannan", 65797));

        for (Object ob : lstEmploy) {
            Employ e = (Employ) ob;
            System.out.println(e);
        }
    }
}