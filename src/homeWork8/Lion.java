package homeWork8;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Lion "+ getName() + " says " + "Roar");
    }
    @Override
    public void hunting() {
        System.out.println("lion " + getName() + " goes hunting");
    }
}
