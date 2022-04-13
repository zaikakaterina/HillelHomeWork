package demo;

import java.util.Arrays;

public enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Saturday");

    private String name;
    private String[] subjects;

    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
