//Abstract example
abstract class Training{
    abstract void name();
    abstract void email();
}
class Karthi extends Training{
    @Override
    public void name(){
        System.out.println("Name is karthi");
    }
    @Override
    public void email(){
        System.out.println("Email is Karthi@gmail.com");
    }
}

class Raji extends Training {
    @Override
    public void name() {
        System.out.println("Name is Raji");
    }

    @Override
    public void email() {
        System.out.println("Email is raji@gmail.com");
    }
}

class Jerry extends Training {
    @Override
    public void name() {
        System.out.println("Name is Jerry");
    }

    @Override
    public void email() {
        System.out.println("Email is Jerry@gmail.com");
    }
}
public class AbsDemo{
    public static void main(String[] args) {
        Training[] arr = new Training[]{
            new Karthi(),new Raji(),new Jerry()//arrays of objects
        };
        for (Training t : arr) {
            t.name();
            t.email();
        }

    }
}