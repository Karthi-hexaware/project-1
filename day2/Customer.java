import java.util.function.ObjLongConsumer;

public class Customer{
    int custId;
    String cname;
    double billAmt;
    public final String toString(){
        return "CustId :" +custId+ " Name:" +cname +" Cost:" +billAmt;
    }
    Object ob){
        Customer c1=(Customer)ob;
        System.out.println(c1);
    }
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.custId=1;
        c1.cname="Karthiga";
        c1.billAmt=64643;
        c1.show(c1);
    }
}