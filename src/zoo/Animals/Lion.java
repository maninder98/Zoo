package zoo.Animals;

public class Lion extends Animal {
    public String name;
    public String helloText;
    public String eatText;

    public Lion() {
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
