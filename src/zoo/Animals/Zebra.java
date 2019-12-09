package zoo.Animals;

public class Zebra extends Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra() {
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
