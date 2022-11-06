package objects;

public class Cat extends Animal {
    private String color;
    public Cat(boolean vegetarian, String eats, int noOfLegs,String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }
    public Cat(boolean vegetarian, String eats, int noOfLegs){
        super(vegetarian, eats,noOfLegs);
        this.color = "white";
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
       return color;
    }
    public void print(){
    System.out.println (getColor() +" "+"cat"+" "+"eats"+" "+getEats()+" "+"has"+" "+getNoOfLegs()+"legs");
}
}
