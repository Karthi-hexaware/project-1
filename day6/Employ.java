import java.awt.List;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

public class Employ {
    int empno;
    String name;
    double basic;
    
    public Employ() {

    }

    public Employ(int empno,String name,double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public String toString() {
        return "Employ [empno" + empno + ", name=" + name + ", basic=" + basic + "]";
    }
}




