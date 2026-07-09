
public class Dog extends AbstractAnimal implements playableAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Say Woof ! Woof !");
    }

    @Override
    public void play() {
        System.out.println(getName() + "Is fetching a ball with Vistors !");
    }
}
