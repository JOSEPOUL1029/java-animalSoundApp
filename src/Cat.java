
public class Cat extends AbstractAnimal implements playableAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is chasing a laser pointer with the visitors.");
    }
}
