package zoo.Animals;

public class Hippo extends Animal {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo() {
        super();
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }


    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
