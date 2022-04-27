package Basics.java_27th;

public class Car {
    String company;
    String name;
    String color;
    Double price;
    public Car(String company,String name,String color,double price){
        this.company = company;
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "CarDetails [\ncompany=" + company +" \nname=" + name +"\ncolor=" + color + "\nprice=" + price +"]";
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
class Madhu{
    public static void main(String[] args){
        Car c = new Car("TATA","Tesla","yellow",20000);
        Car c1 = new Car("TATA","Audi","red",30000);
        System.out.println(c);
        System.out.println(c1);
    }
}