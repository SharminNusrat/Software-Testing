package io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class FileIOTest {

    FileIO fileIO = new FileIO();
    String testFilePath = "src/test/resources/grades_valid.txt";
    String emptyFilePath = "src/test/resources/empty_file.txt";
    String invalidFilePath = "src/test/resources/grades_invalid.txt";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testValidFileOutput() {
        int[] expected = {3, 9, 0, 2, 10, 9, 3, 8, 0, 3};
        assertArrayEquals(expected, fileIO.readFile(testFilePath));
    }

    @Test
    public void testInvalidFileOutput() {
        int[] expected = {3, 9, 2, 10, 8, 0, 3};
        assertArrayEquals(expected, fileIO.readFile(invalidFilePath));
    }

    @Test
    public void testEmptyFile() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertNotEquals(0, (fileIO.readFile(emptyFilePath)).length);
        });
    }

    @Test
    public void testNonExistentFile() {
        assertThrows(IllegalArgumentException.class, () -> {
            fileIO.readFile("nonexistent.txt");
        });
    }

    @Test
    public void testReadFile_IOException() {
        String testPath = "src/test/resources/test_io.txt";
        try {
            File testFile = new File(testPath);
            testFile.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(testFile)) {
                writer.write("1\n2\n3");
            }
            testFile.delete();
            testFile.mkdir();

            RuntimeException exception = assertThrows(
                    RuntimeException.class,
                    () -> fileIO.readFile(testPath)
            );
            assertEquals("Error while reading file", exception.getMessage());
            assertTrue(exception.getCause() instanceof IOException);

            testFile.delete();
        } catch (IOException e) {
            fail("Setup failed: " + e.getMessage());
        }
    }
}