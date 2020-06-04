

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;


import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class TestCoder {
    private StringWriter string_writer = null;
    private Coder coder = null;
    private String current_string = null;

    @Before
    public void setUp() {
        string_writer = new StringWriter(128);
        current_string = "a";
        coder = new Coder(string_writer);
    }

    @Test
    public void testWrite() throws NullPointerException, IOException {
        coder.write(current_string);

    }

    @Test
    public void testCodeChar() {
        char actual = coder.codeChar('a');
        char expected = (char)((int)'a' + (int)'a');

        assertEquals(actual, expected);
    }

    @Test
    public void testGetString() {

        assertNotNull(coder.getString());
    }

}
