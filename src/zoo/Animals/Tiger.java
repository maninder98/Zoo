package zoo.Animals;

import java.util.Random;

public class Tiger extends Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger() {
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatMeat() {
        eatText = "nomnomnmom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
