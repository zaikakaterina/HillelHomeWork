package school.impl;

import demo.Days;
import school.abstracts.People;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Students extends People{
    Set<Subjects> subjects = new HashSet<>();
    private int grade;
    private Days[] workingDays;
    private Days[] daysOff;



    public Students(String name, int age, int grade, Days[] workingDays, Days[] daysOff) {
        super(name, age);
        this.grade = grade;
        this.workingDays = workingDays;
        this.daysOff = daysOff;
    }

    public void haveSubject(Subjects subject) {
        for (Subjects s: subjects) {
                if (subjects == null) {
                    subjects.add(subject);
                    return;
                }
            }
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(subjects, students.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjects);
    }

    public Days[] getWorkingDays() {
        return workingDays;
    }

    public Days[] getDaysOff() {
        return daysOff;
    }

    public void hasSubjects(Subjects subject) {
        for (Subjects s : subjects) {
            if (s != null){
                s.getSubjects(subjects);
            }
        }
    }

    public int getAverageGrade() {
        return grade;
    }

    @Override
    public void atSchool() {
        System.out.println("Student " + getName() + " studies on " + getAverageGrade());
    }

    @Override
    public void havingBreak(){
        System.out.println("Students are having break at 14.00");
    }

}


