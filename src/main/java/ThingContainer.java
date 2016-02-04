/**
 * Created by chuckH on 2/4/16.
 */
import java.awt.*;
import java.util.Arrays;

public class ThingContainer {


    String[] ColorfulThing = new String[4];

    public ThingContainer(String green, String purple, String blue) {  //constructor
        int size = ColorfulThing.length;

    }

    public void addColorfulThing(String[] ColorfulThing) {
        int size = 0;
        ColorfulThing = new String[size];
        for (int i = 0; i < size; i++)
            if (i < size)
                System.out.println(ColorfulThing[i]);
            else
                System.out.println("Array is full! the value" + " " + ColorfulThing + " " + "cannot be added.");
    }


}


