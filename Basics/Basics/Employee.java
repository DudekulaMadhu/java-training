package Basics.Basics;

import java.time.LocalTime;
import java.util.Scanner;

public class Employee {
    String eName;
    String eRole;
    double eSalary;
    String dob;
    double exp;

    public Employee(String eName2, String eRole2, double eSalary2, String dob2, double exp2) {
    }

    @Override
    public String toString(){
        return "Employee [eName=" + eName + ",eRole=" + eRole + ",eSalary=" + eSalary + ",dob=" + ",exp=" + exp + "]";
    }

   public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public String geteRole() {
        return eRole;
    }
    public void seteRole(String eRole) {
        this.eRole = eRole;
    }
    public double geteSalary() {
        return eSalary;
    }
    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    
}
class EmployeeSystem{
    static Scanner sc = new Scanner(System.in);
    private static Scanner Docsc;

    private static Employee addEmployee(){
        System.out.println("Enter the Employee Name");
        String eName = sc.nextLine();
        System.out.println("Enter the Employee Role");
        String eRole = sc.nextLine();
        System.out.println("Enter the Employee Salary");
        double eSalary = sc.nextDouble();
        System.out.println("Enter the Employee DOB (dd/mm/yy):");
        String dob = Docsc.nextLine();
        String d = dob.split("/")[0];
        String m = dob.split("/")[1];
        String y = dob.split("/")[2];

        System.out.println(LocalTime.of(Integer.parseInt(y),Integer.parseInt(m),Integer.parseInt(d)));
        System.out.println("Enter the Employee Experience");
        double exp = sc.nextDouble();

        Employee e = new Employee(eName,eRole,eSalary,dob,exp);
        System.out.println("Employee Added successfully");
        System.out.println(e);
        return e;
    }
    public static void main(String[] args){
        //Menu Driven Program
        while(true){
            System.out.println("1.Add an Employee");
            System.out.println("2.Exit the Programe");
            System.out.println("Enter your choice:- ");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println("Thanks for using our Employee System.");
                    System.exit(0);//Exit the programe
                    break;
            }
        }
    }
}
