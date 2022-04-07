package school.impl;

import school.abstracts.People;

public class Students extends People{

    private int grade;
    private Subjects[] subjects;

    public Students(String name, int age, int grade, int subjectNumber) {
        super(name, age);
        this.grade = grade;
        subjects = new Subjects[subjectNumber];
    }

    public void haveSubject(Subjects subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                return;
            }
        }
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


