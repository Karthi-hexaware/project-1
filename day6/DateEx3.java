//finds no of days gap(for different year use )
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateEx3 {

    public static void main(String[] args) throws ParseException {
        String stDate, endDate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Date(yyyy-mm-dd)");
        stDate = sc.next();
        System.out.println("Enter End Date(yyyy-mm-dd)");
        endDate = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date sdate = sdf.parse(stDate);
        Date edate = sdf.parse(endDate);
        long diff = edate.getTime()-sdate.getTime() ;//gettime return time in millisec
        int noDays = (int)diff/(1000*60*60*24);//changing milli sec to no of days
        System.out.println(noDays);
    }
}