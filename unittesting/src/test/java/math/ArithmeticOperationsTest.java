package math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticOperationsTest {

    ArithmeticOperations operations = new ArithmeticOperations();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tenDivideByTwoShouldEqualFive() {
        Assert.assertEquals(5.0F, operations.divide(10, 2), 1e-10);
    }

    @Test
    public void denominatorZeroShouldReturnException() {
        assertThrows(ArithmeticException.class, () -> {
            operations.divide(10.0, 0.0);
        });
    }

    @Test
    public void xNegativeShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.multiply(-10, 0);
        });
    }

    @Test
    public void yNegativeShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.multiply(0, -10);
        });
    }

    @Test
    public void xAndYBothNegativeShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.multiply(-10, -10);
        });
    }

    @Test
    public void xMultiplyByZeroShouldReturnZero() {
        Assert.assertEquals(0, operations.multiply(3, 0));
    }

    @Test
    public void yMultiplyByZeroShouldReturnZero() {
        Assert.assertEquals(0, operations.multiply(0, 3));
    }

    @Test
    public void threeMultiplyByFourShouldReturnTwelve() {
        Assert.assertEquals(12.0F, operations.multiply(3, 4), 1e-10);
    }

    @Test
    public void integerMaxValueMultiplyByOneShouldReturnIntegerMaxValue() {
        Assert.assertEquals(Integer.MAX_VALUE, operations.multiply(Integer.MAX_VALUE, 1), 1e-10);
    }

    @Test
    public void integerMaxValueMultiplyByTwoShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.multiply(Integer.MAX_VALUE, 2);
        });
    }
}