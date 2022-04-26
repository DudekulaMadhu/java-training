package Basics.Basics;

public class employeDetails {
    int id;
    String empName;
    String domain;
    double salary;
    public employeDetails(int id, String empName,String domain,double salary){
        this.id = id;
        this.empName = empName;
        this.domain = domain;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "employeDetails [\nempName=" + empName + "  \ndomain = " + domain + " \nsalary = " + salary + " \nid = " + id +"]";
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public String getDomain(){
        return domain;
    }
    public void setDomain(String domain){
        this.domain = domain;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
class Zensar{
    public static void main(String[] args){
        employeDetails e = new employeDetails(67625, "Madhu", "Micro Services java", 20000);
        System.out.println(e);
    }
}
