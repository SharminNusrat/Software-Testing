import static org.junit.Assert.*;

public class MyClassTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void divide() {
        float expected = 2.0F;
        float actual = (new MyClass()).divide(10, 5);
        assertEquals(expected, actual, 1e-3);
    }
}