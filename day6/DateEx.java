//example to customise date format
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//customized format
        System.out.println(sdf.format(dt));
    }
}