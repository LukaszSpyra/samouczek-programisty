package pl.samouczekprogramisty.gradeBookTDD;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Integer> notes = new ArrayList<>();
    private final String name;

    public Subject(String name) {
        this.name = name;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void addNoteToSubject(int note){
        if (note<1 || note>6){
            throw new IllegalArgumentException("Note shall be between 1 and 6.");
        }
        notes.add(note);
    }

    public double calculateAverageNote(){
        int sum = 0;
        for (int index : notes) {
            sum = sum + index;
        }
        if (sum == 0){
            throw new IllegalStateException("Subject has no notes");
        }
        return (sum)/(notes.size());
    }
}
