package pl.samouczekprogramisty.GradeBookTDD;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GradeBookTest {
    Subject subject = new Subject();
    Map<String, Subject> testSubject = new HashMap<>();
    testSubject.Entry(<String, Subject> entry);
    GradeBook gradeBook = new GradeBook();

    @Test
    public void checkIfCreatedGradeBookIsEmpty() {
        assertNull(gradeBook);
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}