//Example of ArrayList using Integer
import java.util.ArrayList;
import java.util.List;

public class ArrInt {

    public static void main(String[] args) {
        List lstData = new ArrayList();
        lstData.add(new Integer(56));
        lstData.add(new Integer(42));
        lstData.add(new Integer(89));
        lstData.add(new Integer(456));
        lstData.add(new Integer(44));
        int sum=0;
        for (Object ob : lstData) {
            sum+=(Integer)ob;//object cannot be sum here we are doing typecasting
        }
        System.out.println("Sum :" +sum);
    }
}