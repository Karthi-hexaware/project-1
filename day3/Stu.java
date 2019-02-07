public class Stu{
    int sno;
    String firstname;
    String lastname;
    double cgp;
    public int getSno(){
        return sno;
    }
    public void setSno(int sno){
        this.sno=sno;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public double getCgp(){
        return cgp;
    }
    public void setCgp(Double cgp){
        this.cgp=cgp;
    }
    public final String toString(){
        return "Sno:" +sno + "\nFirstname:" +firstname + "\nLastname:" +lastname+" \nCGP:" +cgp;
    }
    public static void main(String[] args) {
        Stu st=new Stu();
        st.setSno(454);
        st.setFirstname("Karthiga");
        st.setLastname("pitchiah");
        st.setCgp(7.56);
        System.out.println(st);
    }

}