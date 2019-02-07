public class Emp{
    private int empno;
    private String name;
    private double basic;
    public int getempno(){
        return empno;
    }
    public void setEmpno(int empno){
        this.empno=empno;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
    
    
    public final String toString(){
        return "Empno:" +empno + " Name:" +name +" basic:" +basic;
    }
    public static void main(String[] args) {
        Emp ob=new Emp();
        ob.setEmpno(12);
        ob.setName("karthi");
        ob.setBasic(54642.65);
        System.out.println(ob);
    }

}