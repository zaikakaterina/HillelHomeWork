package school.impl;

import demo.Days;
import school.abstracts.People;

public class Students extends People{

    private int grade;
    private Subjects[] subjects;
    private Days[] workingDays;
    private Days[] daysOff;

    public Students(String name, int age, int grade, int subjectNumber, Days[] workingDays, Days[] daysOff) {
        super(name, age);
        this.grade = grade;
        subjects = new Subjects[subjectNumber];
        this.workingDays = workingDays;
        this.daysOff = daysOff;
    }

    public void haveSubject(Subjects subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                return;
            }
        }
    }

    public Days[] getWorkingDays() {
        return workingDays;
    }

    public Days[] getDaysOff() {
        return daysOff;
    }

    public void hasSubjects() {
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


