package zoo.Animals;

public class Elephant extends Animal {
    public String name;
    public String helloText;
    public String eatText;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void sayHello() {
        helloText = "w-h-o-o-m";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "hmmmmm lekker";
        System.out.println(eatText);
    }
}
