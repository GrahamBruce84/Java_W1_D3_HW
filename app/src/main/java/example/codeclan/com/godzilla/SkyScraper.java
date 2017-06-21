package example.codeclan.com.godzilla;

/**
 * Created by grahambruce on 21/06/2017.
 */

public class SkyScraper extends HumanConstructs implements Destroyable{
    public SkyScraper(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die(){
        return "SkyScraper has been destroyed";
    }

    public String attack(Kaiju kaiju){
        return "Falls on monster, BOOYA!";
    }



}
