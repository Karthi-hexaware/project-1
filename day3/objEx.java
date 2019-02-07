public class objEx{
    public void show(Object ob){
        if(ob=="Karthi"){
            System.out.println("hi");
        }else{
            System.out.println("bye");
        }
    }
    public static void main(String[] args) {
        String ob="Karthi";
        new objEx().show(ob);
    }
}