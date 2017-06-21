package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SkyScraperTest {
    SkyScraper skyscraper;

    @Before
    public void before(){
        skyscraper = new SkyScraper("building", 30);
    }

    @Test
    public void canDie(){
        assertEquals("SkyScraper has been destroyed", skyscraper.die());
    }
}
