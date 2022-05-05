package core_java;

import java.util.Scanner;
import java.util.Stack;

class Details{
    String id;
    String name;
    int age;
    String disease;
    int phoneno;
    public Details(String id, String name,int age,String disease,int phoneno){
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.phoneno = phoneno;
    }
    @Override
    public String toString(){
        return "Details[age=" + age + ", name=" + name + ", age= " + age + ", disease = " + disease + ", phoneno = " + phoneno + "]";
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDisease(){
        return disease;
    }
    public void setDisease(String disease){
        this.disease = disease;
    }
    public int getPhoneno(){
        return phoneno;
    }
    public void setPhoneno(int phoneno){
        this.phoneno = phoneno;
    }
}
public class medicalShop {
    static Stack<Details> stack = new Stack<>();
    public static Details enterDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id : ");
        String id = sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter disease: ");
        String disease = sc.nextLine();
        System.out.println("Enter phoneno: ");
        int phoneno = sc.nextInt();
        Details d = new Details(id, name, age, disease, phoneno);
        sc.close();
        return d;
    }
    public static void main(String[] args){
         Details d = enterDetails();
         stack.add(d);
         stack.forEach(e ->{
             System.out.println("ID : " + e.getId());
             System.out.println("Name :" + e.getName());
             System.out.println("Age: " + e.getAge());
             System.out.println("Disease: " + e.getDisease());
             System.out.println("phoneno: " + e.getDisease());
         });
    }
}
