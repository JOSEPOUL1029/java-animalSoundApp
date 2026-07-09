
public class Bird extends AbstractAnimal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp Chirp!");
    }
    // Bird does not implement PlayableAnimal as it is wild/non-domesticated here
}
