class NegativeException extends Exception {
    NegativeException(String error) {
        super(error);
    }
}

class NumberZeroException extends Exception {
    NumberZeroException(String error) {
        super(error);
    }
}

public class Custom {
    public void sum(int a,int b) throws NumberZeroException,NegativeException {
        boolean flag = true;
        if(a <  0 || b < 0) {
            throw new NegativeException("Negative num not allowed");
        }
        if (a == 0 || b == 0) {
            throw new NumberZeroException("Zero is invalid");
        }
        if(flag == true) {
            int c= a+b;
            System.out.println("Sum: "+c);
        }
    }
    public static void main(String[] args) {
        try {
            new Custom().sum(12,15);
        } catch(NegativeException e){
            e.printStackTrace();
        } catch(NumberZeroException e) {
            e.printStackTrace();
        }
    }
}