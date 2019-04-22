package excercises.polimorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void giveSound(){
        System.out.println("Bark bark");
    }

    public void bark(){
        System.out.println("Szczekam");
    }
}
