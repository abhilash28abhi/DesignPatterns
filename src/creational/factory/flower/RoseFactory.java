package creational.factory.flower;

import creational.factory.flower.impl.PinkRose;
import creational.factory.flower.impl.RedRose;
import creational.factory.flower.impl.YellowRose;

public class RoseFactory {

    public Rose getRose(String roseColor){
        if(roseColor == null){
            return null;
        }
        if(roseColor.equalsIgnoreCase("RED")){
            return new RedRose();

        } else if(roseColor.equalsIgnoreCase("YELLOW")){
            return new YellowRose();

        } else if(roseColor.equalsIgnoreCase("PINK")){
            return new PinkRose();
        }
        return null;
    }
}
