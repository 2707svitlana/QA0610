package lesson5;

public class Dogs {

    private int age;
    private String name;
    private int height;
    private String color;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dogs(String name, int age, String color, int height) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "white";
        this.height = 78;
    }

    public void print() {
        System.out.println("Name:"+name+";");
        System.out.print("Age:"+age +";");
        System.out.print("Color:"+color+";");
        System.out.print("Height:"+height+";");
    }

    public Dogs() {
        System.out.println("Creating object of the class Dogs");
    }

}




