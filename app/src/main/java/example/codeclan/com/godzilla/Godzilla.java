package example.codeclan.com.godzilla;

import static android.icu.text.RelativeDateTimeFormatter.Direction.THIS;

/**
 * Created by grahambruce on 21/06/2017.
 */

public class Godzilla extends Kaiju implements Attack{


    public Godzilla(String name, int healthValue) {
        super(name, healthValue);
    }

    public int getDestructiveForce(){
        return 50;
    }

    public String roar(){
        return "IN YOUR FACE!!";
    }
}
