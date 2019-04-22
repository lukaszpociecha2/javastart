package excercises.polimorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound(){
        System.out.println("Meow");
    }

    public void meow(){
        System.out.println("miauczę");
    }
}
