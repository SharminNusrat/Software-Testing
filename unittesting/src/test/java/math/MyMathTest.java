package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    MyMath math = new MyMath();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialWithNegativeInputShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            math.factorial(-1);
        });
    }

    @Test
    public void factorialWithInputGreaterThanTwelveShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            math.factorial(13);
        });
    }

    @Test
    public void zeroFactorialShouldReturnOne() {
        assertEquals(1, math.factorial(0));
    }

    @Test
    public void twelveFactorialShouldReturn479001600() {
        assertEquals(479001600, math.factorial(12));
    }

    @Test
    public void threeFactorialShouldReturnSix() {
        assertEquals(6, math.factorial(3));
    }

    @Test
    public void isPrimeWithInputLessThanTwoShouldReturnException() {
        assertThrows(IllegalArgumentException.class, () -> {
            math.isPrime(1);
        });
    }

    @Test
    public void isPrimeWithInputTwoShouldReturnTrue() {
        assertTrue(math.isPrime(2));
    }

    @Test
    public void isPrimeWithInputTenShouldReturnFalse() {
        assertFalse(math.isPrime(10));
    }

    @Test
    public void isPrimeWithLargeInputShouldReturnTrue() {
        assertTrue(math.isPrime(982451653));
    }

    @Test
    public void isPrimeWithEvenNumberLikeFourShouldReturnFalse() {
        assertFalse(math.isPrime(4));
    }

}