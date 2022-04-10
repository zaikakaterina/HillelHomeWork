package demo;

import java.util.Arrays;

public enum Days {
    MONDAY("Monday", new String[] {"Mathematics,", "Literature,", "Computer Science,", "Language Studies"}),
    TUESDAY("Tuesday", new String[] {"Computer Science,", "Mathematics,", "Language Studies,", "Biology"}),
    WEDNESDAY("Wednesday", new String[] {"Language Studies,", "Computer Science,", "Mathematics,", "Biology"}),
    THURSDAY("Thursday", new String[] {"Physics,", "Computer Science,", "Biology,", "Mathematics"}),
    FRIDAY("Friday", new String[] {"Physics,", "Computer Science,", "Mathematics,", "Biology"}),
    SATURDAY("Saturday", new String[] {"Day off"}),
    SUNDAY("Saturday", new String[] {"Day off"});

    private String name;
    private String[] subjects;

    Days(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getSubject(int index) {
        return subjects[index];
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
