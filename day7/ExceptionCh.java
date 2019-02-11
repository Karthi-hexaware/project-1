//checked and unchecked exception
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExceptionCh {
    public void show(String dt) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date doj = sdf.parse(dt);
        System.out.println(doj);
    }
    public static void main(String[] args) {
        ExceptionCh ch =new ExceptionCh();
        try{
            ch.show("2018-10-11");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}