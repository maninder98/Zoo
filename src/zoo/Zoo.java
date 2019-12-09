package zoo;

import zoo.Animals.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Dog tommy = new Dog();
        tommy.name = "tommy";
        Elephant hathi = new Elephant();
        hathi.name = "hathi";

        //save all animals in a arraylist
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(tommy);
        animals.add(hathi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();


        for (Animal animal : animals) {
            if (input.equals(commands[0] + " " + animal.getName())) {
                animal.sayHello();
            } else if (input.equals(commands[0])) {
                animal.sayHello();

            } else if (input.equals(commands[1])) {
                if (animal instanceof Zebra) {
                    ((Zebra) animal).eatLeaves();
                } else if (animal instanceof Pig) {
                    ((Pig) animal).eatLeaves();
                } else if (animal instanceof Hippo) {
                    ((Hippo) animal).eatLeaves();
                } else if (animal instanceof Elephant) {
                    ((Elephant) animal).eatLeaves();
                }
            } else if (input.equals(commands[2])) {
                if (animal instanceof Tiger) {
                    ((Tiger) animal).eatMeat();
                } else if (animal instanceof Lion) {
                    ((Lion) animal).eatMeat();
                } else if (animal instanceof Dog) {
                    ((Dog) animal).eatMeat();
                }
            } else if (input.equals(commands[3])) {
                if (animal instanceof Tiger) {
                    ((Tiger) animal).performTrick();
                } else if (animal instanceof Pig) {
                    ((Pig) animal).performTrick();
                } else if (animal instanceof Dog) {
                    ((Dog) animal).performTrick();

                }
            } else {
                System.out.println("Unknown Command: " + input);
                break;
            }


        }
    }
}
