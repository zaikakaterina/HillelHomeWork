package demo;

import school.impl.Students;
import school.impl.Subjects;
import school.impl.Teacher;
import school.oneclass.Classroom;
import school.impl.Utils;

public class Demo {
    public static void main(String[] args) {
        Days[] days = {Days.MONDAY, Days.FRIDAY, Days.SATURDAY};
        Classroom classroom = new Classroom(5);
        Students students = new Students("Vanya", 10, 100, days, days);
        Teacher teacher = new Teacher("Steven", 36, "mathematics");
        Subjects subjects = new Subjects("mathematics", 40);
        Utils utils = new Utils();
        classroom.enrollStudent(students);
        classroom.studies();
        students.haveSubject(subjects);
        students.hasSubjects(subjects);
        students.havingBreak();
        teacher.atSchool();
        teacher.havingBreak();
        utils.schedule(students);
    }
}
