import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PersonTest {
    private File file = null;
    private Person person = null;
    private JSONChecker jsonChecker = null;
    private Person personFromJson = null;

    @Before
    public void setUp() {
        file = new File("D:\\KPI\\СМіТРПЗ-1\\Lab2\\person.json");
        person = new Person("Vasya", "Rogov", 1.75, 37, 99.0);
        jsonChecker = new JSONChecker();
        jsonChecker.saveToJSONFile(person, file);
    }

    @Test
    public void PersonIsSerializable() {
        personFromJson = jsonChecker.loadFromJSON(file);
        assertTrue(person.equals(personFromJson));
    }

    @Test
    public void testIsEquals() throws Exception {
        EqualsVerifier.forClass(Person.class)
                .verify();

    }
}
