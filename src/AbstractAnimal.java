
public abstract class AbstractAnimal {

    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    Abstract method for runtime polymorphism
    public abstract void makeSound();

}
