package pl.samouczekprogramisty.gradeBookTDD;

import org.junit.Test;

import static org.junit.Assert.*;


public class SubjectTest {
    Subject subject = new Subject("Math");

    @Test
    public void checkIfNoteAddedToSubject(){
        subject.addNoteToSubject(4);
        assertNotNull(subject.getNotes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void noteShallBeOneToSix(){
        subject.addNoteToSubject(-4);
    }

    @Test(expected = IllegalStateException.class)
    public void subjectShouldHaveNote(){
        subject.calculateAverageNote();
    }

    @Test
    public void shouldCalculateAverageOfNotes(){
        subject.addNoteToSubject(4);
        subject.getNotes().add(4);
        subject.getNotes().add(1);
        assertEquals(subject.calculateAverageNote(), 3.0, 0.001);
    }







}