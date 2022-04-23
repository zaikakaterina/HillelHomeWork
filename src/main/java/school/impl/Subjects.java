package school.impl;

import demo.Days;

import java.util.Set;

public class Subjects{

    private String title;
    private int subjectHours;

    Students students = new Students("Vanya", 10, 100, new Days[]{}, new Days[]{});

    public Subjects(String title, int subjectHours) {
        this.title = title;
        this.subjectHours = subjectHours;
    }

    public String getTitle() {
        return title;
    }

    public int getSubjectHours() {
        return subjectHours;
    }

    public void getSubjects(Set<Subjects> subjects){
        System.out.println("Student " + students.getName() + " has " + getTitle() + " with " + getSubjectHours() + " hours per week ");
    }

}
