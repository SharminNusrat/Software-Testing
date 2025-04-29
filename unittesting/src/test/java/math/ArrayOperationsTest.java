package math;

import io.FileIO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

    ArrayOperations operations = new ArrayOperations();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFindPrimesInFile() {
        FileIO mockFileIO = mock(FileIO.class);
        MyMath mockMyMath = mock(MyMath.class);

        String filePath = "src/test/resources/grades_valid.txt";
        when(mockFileIO.readFile(filePath)).thenReturn(new int[]{2, 3, 4, 5, 7, 9, 11, 12, 14});

        when(mockMyMath.isPrime(2)).thenReturn(true);
        when(mockMyMath.isPrime(3)).thenReturn(true);
        when(mockMyMath.isPrime(4)).thenReturn(false);
        when(mockMyMath.isPrime(5)).thenReturn(true);
        when(mockMyMath.isPrime(7)).thenReturn(true);
        when(mockMyMath.isPrime(9)).thenReturn(false);
        when(mockMyMath.isPrime(11)).thenReturn(true);
        when(mockMyMath.isPrime(12)).thenReturn(false);
        when(mockMyMath.isPrime(14)).thenReturn(false);

        int[] expected = {2, 3, 5, 7, 11};

        Assert.assertArrayEquals(expected, operations.findPrimesInFile(mockFileIO, filePath, mockMyMath));
    }
}