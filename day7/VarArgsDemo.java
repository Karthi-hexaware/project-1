public class VarArgsDemo {
    public void show (String...s) { //it will accept n number of arguments
        for (String e : s) {
            System.out.println(e + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgsDemo ob = new VarArgsDemo();
        ob.show();
        ob.show("Karthi");
        ob.show("Kayal","Raji");
        ob.show("Latha","Mani","Jerry");
    }
}