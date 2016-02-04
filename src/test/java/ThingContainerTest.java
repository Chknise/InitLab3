import static org.junit.Assert.*;


public class ThingContainerTest {

    @org.junit.Test
    public void testAddColorfulThing() throws Exception {
        ThingContainer container = new ThingContainer("GREEN","PURPLE","BLUE");
        container.addColorfulThing(String[]);

        assertEquals("Colors were not added","green, purple, blue", );

    }
}

