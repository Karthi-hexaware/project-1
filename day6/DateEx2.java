import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateEx2 {

    public static void main(String[] args) throws ParseException {
        String dt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date(yyyy-MM-dd):");
        dt = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(dt);
        System.out.println(d);
    }
}