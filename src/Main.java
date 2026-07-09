
//array, loops and runtime polymorphism
public class Main {

    public static void main(String[] args) {
        // Array storing different animal objects polymorphically
        AbstractAnimal[] zooAnimals = new AbstractAnimal[3];

        zooAnimals[0] = new Dog("Buddy");
        zooAnimals[1] = new Cat("Whiskers");
        zooAnimals[2] = new Bird("Pip");

        System.out.println("--- Zoo Activity Report ---");

        // Loop iterating through the array
        for (AbstractAnimal animal : zooAnimals) {
            System.out.println("\nAnimal: " + animal.getName());

            // Runtime Polymorphism: dynamic binding of the makeSound method
            animal.makeSound();

            // Check if the animal is domesticated/playable using instanceof
            if (animal instanceof playableAnimal) {
                playableAnimal playable = (playableAnimal) animal;
                playable.play();
            } else {
                System.out.println(animal.getName() + " is a wild animal and cannot play with visitors.");
            }
        }
    }
}
