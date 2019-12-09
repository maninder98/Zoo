package zoo.Animals;

public class Dog extends Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trickText;


    @Override
    public void sayHello() {
        helloText = "bow-wow";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatMeat(){
        eatText = "nom, nom, nom";
        System.out.println(eatText);
    }

    public void performTrick(){
        trickText = "plays dead";
        System.out.println(trickText);
    }

}
