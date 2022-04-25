package demo;

import school.impl.Students;
import school.impl.Subjects;
import school.impl.Teacher;
import school.oneclass.Classroom;
import school.impl.Utils;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Days[] days = {Days.MONDAY, Days.FRIDAY, Days.SATURDAY};
        Set<Subjects> subjects1 = new HashSet<>();
        subjects1.add(new Subjects("math", 40));
        Classroom classroom = new Classroom(5);
        Students students = new Students("Vanya", 10, 100, days, days, subjects1);
        Teacher teacher = new Teacher("Steven", 36, "mathematics");
        Subjects subjects = new Subjects("mathematics", 40);
        Utils utils = new Utils();
        classroom.enrollStudent(students);
        classroom.studies();
        students.haveSubject(subjects);
        students.hasSubjects(subjects1);
        students.havingBreak();
        teacher.atSchool();
        teacher.havingBreak();
        utils.schedule(students);
    }
}
