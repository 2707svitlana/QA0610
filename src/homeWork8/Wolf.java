package homeWork8;

public class Wolf extends Animal implements WildAnimal{

    public Wolf(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Wolf "+ getName() + " says " + "Hawdo");
    }
    @Override
    public void hunting() {
        System.out.println("lion " + getName() + " goes hunting");
    }
}
