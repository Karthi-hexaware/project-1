import java.util.InputMismatchException;
import java.util.Scanner;


public class Div{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter two number:");
        try{
           a=sc.nextInt();
           b=sc.nextInt();
           c=a/b;
           System.out.println("\nDivision:" +c);
        } catch (InputMismatchException e) {
            System.out.println("\nOnly Number");
        }
        catch(ArithmeticException x){
            System.out.println("\nNumber cannot divided by zero");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("\nProgram from FTP batch");
        }
    }
}