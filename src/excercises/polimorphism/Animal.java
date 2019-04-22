package excercises.polimorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void giveSound(){
        System.out.println("Jestem zwierzeciem i nazywam się: " + getName());
    }
}
