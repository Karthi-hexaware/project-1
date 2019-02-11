import java.util.List;
import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList();//generic(<Integer>)
        //List data = new ArrayList();
        data.add(new Integer(42));
        data.add(new Integer(33));
        data.add(new Integer(12));
        //data.add(new Integer("karthi"))
        data.add(new Integer(1));
        int sum = 0;
        //for(Object ob :data)[through exception in for each loop]
        for( Integer ob : data) {
            sum += ob;
            //sum += (Integer) ob;
        }
        System.out.println(sum);
    }
}

