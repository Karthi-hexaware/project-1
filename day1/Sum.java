import java.util.Scanner;
public class Sum{
 public static void main(String[] args) {
   int num1,num2;
   System.out.println("Enter two number:");
   Scanner sc=new Scanner(System.in);
   num1=sc.nextInt();
   num2=sc.nextInt();
   int sum=num1+num2;
   System.out.println("Sum:" +sum);   
}
}