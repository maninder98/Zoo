package zoo.Animals;

public abstract class Animal {

    private String name;

    public Animal(String aName) {
        name = aName;
    }

    public Animal() {

    }

    public abstract String getName();

    public abstract void sayHello();


}
