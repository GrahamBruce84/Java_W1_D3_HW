package example.codeclan.com.godzilla;

/**
 * Created by grahambruce on 21/06/2017.
 */

public class Bus extends HumanConstructs implements Destroyable{
    public Bus(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die(){
        return "Thrown into a building!";
    }

    public String attack(Kaiju kaiju){
        return "Ramming Speed! CHOOO CHOOO";
    }
}
