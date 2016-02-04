/**
 * Created by chuckH on 2/4/16.
 */
public class ColorfulThing {


    public enum Colors {PINK, ORANGE, BLACK};
    Colors color;


    private ColorfulThing(Colors color) {  //constructor
        this.color = color;

    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}

