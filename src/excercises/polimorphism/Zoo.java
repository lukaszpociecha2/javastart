package excercises.polimorphism;

public class Zoo {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Kitek");
        Animal kotopies = new Animal("Kotopies");

        animals[0]=dog;
        animals[1]=cat;
        animals[2]=kotopies;

        changeName(dog, "Fafik");

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.giveSound();
        }

        Dog specificDog = null;
        if(dog instanceof Dog){ specificDog=(Dog)dog; };

        specificDog.bark();

        ((Dog)dog).bark();
        ((Cat) cat).meow();

    }

    public static void changeName(Animal animal, String newName){
        animal.setName(newName);
    }

}
