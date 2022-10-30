package lesson5;

import lesson5.Dogs;

public class Lesson5 {
    public static void main(String[] args) {
        var dogs = new Dogs ("Rada",5,"broun", 56);


        System.out.println(dogs.getAge());
        System.out.println(dogs.getName());
        System.out.println(dogs.getHeight());
        System.out.println(dogs.getColor());

        dogs.setAge(2);
        System.out.println(dogs.getAge());

        dogs.setName("Dara");
        System.out.println(dogs.getName());

        dogs.setHeight(30);
        System.out.println(dogs.getHeight());

        dogs.setColor("black");
        System.out.println(dogs.getColor());



        Dogs Tom = new Dogs("Tom",4,"white",56);
        Dogs Bim = new Dogs("Bim",3);
        Dogs ThirdDogs = new Dogs();
        Tom.print();
        Bim.print();

    }
}
