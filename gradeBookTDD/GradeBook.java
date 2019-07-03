package pl.samouczekprogramisty.gradeBookTDD;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Subject> subjects = new HashMap<>();

    public void addSubject(String subjectName){
        subjects.put(subjectName, new Subject(subjectName));
    }

    public Subject getSubject(String subjectName) {
        if (subjects.containsKey(subjectName)) {
            return subjects.get(subjectName);
        } else {
            throw new IllegalArgumentException("Przedmiot nie istnieje");
        }
    }

    public void addNoteToGradeBook(String subjectName, int note){
        Subject subject = getSubject(subjectName);
        subject.addNoteToSubject(note);
    }

    public double calculateAverage(){
        double sumAverages = 0.0;
        for (Subject value : subjects.values()) {
            sumAverages = sumAverages + value.calculateAverageNote();
        }
        return (sumAverages/subjects.size());
    }
}
