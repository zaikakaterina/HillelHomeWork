package school.impl;

import school.abstracts.People;

public class Teacher extends People {

    private String teachingSubject;

    public Teacher(String name, int age, String teachingSubject) {
        super(name, age);
        this.teachingSubject = teachingSubject;
    }

    public String getTeachingSubject() {
        if (teachingSubject == null) return "primary school";
        return teachingSubject;
    }

    @Override
    public void atSchool() {
        System.out.println("Teacher " + getName() + " teaches " + getTeachingSubject());

    }

    @Override
    public void havingBreak(){
        System.out.println("Teacher " + getName() + " has break at 13.00");
    }
}
