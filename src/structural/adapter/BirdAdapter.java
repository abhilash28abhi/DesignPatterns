package structural.adapter;

import structural.adapter.bird.Bird;
import structural.adapter.toyduck.ToyDuck;

//Implementing ToyDuck as we want to use Birds as ToyDuck in this case. It will
//compose the Bird object to be used as ToyDuck
public class BirdAdapter implements ToyDuck {

    //You need to implement the interface your client expects to use
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}
