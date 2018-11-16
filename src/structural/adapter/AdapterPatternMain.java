package structural.adapter;

import structural.adapter.bird.Sparrow;
import structural.adapter.toyduck.PlasticToyDuck;
import structural.adapter.toyduck.ToyDuck;

public class AdapterPatternMain {

    public static void main (String ... args) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck toyDuck = new PlasticToyDuck();

        // Wrap a bird in a birdAdapter so that it behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow------>");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck------>");
        toyDuck.squeak();

        // bird behaving like a toy duck
        System.out.println("BirdAdapter----->");
        birdAdapter.squeak();
    }
}
