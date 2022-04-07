package demo;

import school.impl.Students;
import school.impl.Subjects;
import school.impl.Teacher;
import school.oneclass.Classroom;

public class Demo {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(5);
        Students students = new Students("Vanya", 10, 100, 40);
        Teacher teacher = new Teacher("Steven", 36, "mathematics");
        Subjects subjects = new Subjects("mathematics", 40);
        classroom.enrollStudent(students);
        classroom.studies();
        students.haveSubject(subjects);
        students.hasSubjects();
        students.havingBreak();
        teacher.atSchool();
        teacher.havingBreak();
    }
}
