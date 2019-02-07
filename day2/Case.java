import java.util.Scanner;
public class Case{
    public void show(int n){
        switch(n){
            case 1:System.out.println("Unix");
                   break;
            case 2:System.out.println("Git");
                   break;
            case 3:System.out.println("Git");
                   break;
            default:
                    System.out.println("Invalid Choice");
                    break;
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        new Case().show(n);
    }
}