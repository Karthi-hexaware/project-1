import java.util.Scanner;
class Check{
    public void test(int n){
        if(n>0){
          System.out.println("number is positive");
      }  
      else{
          System.out.println("Number is negative");
      }
    }
    public  static void main(String[] args){
      int n;
      Scanner sc =new Scanner(System.in);
      n=sc.nextInt();
      Check obj=new Check();
      obj.test(n);
      
    }
}