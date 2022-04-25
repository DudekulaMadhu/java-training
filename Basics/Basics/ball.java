package Basics.Basics;

public class ball {
    String material;
    String color;
    double price;

    public ball(String material,String color,double prices){
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString(){
        return "ball color=" + color + "\nmaterial=" + material + "\nprice=" + price;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String materail){
        this.material = material;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(double price){
        this.price = price;
    }
}
class madhu{
    public static void main(String[] args){
      ball b = new ball("lathear","red",99);
      ball b1 = new ball("jumper","yellow",199);
      b.setMaterial("Metal");
      System.out.println(b);
      System.out.println(b1);
    }
}



