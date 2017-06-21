package example.codeclan.com.godzilla;

/**
 * Created by grahambruce on 21/06/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue) {
        super(name, healthValue);
    }

    public int getDestructiveForce(){
        return 5000000;
    }

    public String roar(){
        return "BANANAAAAAAASSSS";
    }
}
