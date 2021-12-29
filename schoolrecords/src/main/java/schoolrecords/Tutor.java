package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    List<Subject> subjects=new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}
