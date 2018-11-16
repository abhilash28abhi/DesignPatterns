package creational.factory.flower;

public class FactoryPatternMain {

    public static void main(String[] args) {
        RoseFactory roseFactory = new RoseFactory();

        //get an object of Red Rose and call its addColor method.
        Rose redRose = roseFactory.getRose("RED");

        //call addColor method of RedRose
        redRose.addColor();

        Rose yellowRose = roseFactory.getRose("YELLOW");
        //call addColor method of YellowRose
        yellowRose.addColor();

        Rose pinkRose = roseFactory.getRose("PINK");
        //call addColor method of PinkRose
        pinkRose.addColor();
    }
}