package pl.samouczekprogramisty.GradeBookTDD;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    Map<String, Subject> subjects;


    public GradeBook(Map<String, Subject> subjects) {
        this.subjects = subjects;
    }
}
