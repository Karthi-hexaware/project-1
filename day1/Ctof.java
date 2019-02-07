import java.util.Scanner;
public class Ctof{
    public void calc(double c) {
        double f;
        f = ((9 * c) / 5) + 32;
        System.out.println("Fahrenheit Value :" + f);
    }
    public static void main(String[] args){
        
        double c;
        System.out.println("Enter Centrigrade Value");
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        Ctof obj=new Ctof();
        obj.calc(c);
    }
}