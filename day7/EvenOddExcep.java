import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.sun.javafx.runtime.SystemProperties;

public class EvenOddExcep {
    public void check(int n) {
        boolean flag = true;
        if(n < 0) {
            flag = false;
            throw new ArithmeticException("Negative num not allowed");
        }
        if(n == 0) {
            flag = false;
            throw new ArrayIndexOutOfBoundsException("Zero is invalid value");
        }
        if (flag == true) {
            if(n%2==0){
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd Number");
            }
        }
    }
    public static void main(String[] args) {
        EvenOddExcep obj = new EvenOddExcep();
        try{
            obj.check(12);
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}