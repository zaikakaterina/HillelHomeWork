package school.oneclass;

import school.impl.Students;

public class Classroom {

    private Students[] students;

    public Classroom(int number) {
        students = new Students[number];
    }

    public void enrollStudent(Students student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public void studies() {
        for (Students s : students) {
            if (s != null){
            s.atSchool();
        }
    }
    }

}
