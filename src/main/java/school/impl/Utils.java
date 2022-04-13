package school.impl;

import demo.Days;
import school.abstracts.People;

import java.util.Arrays;

public class Utils {

    static String[] mondaySchedule = {"Mathematics", "Literature", "Computer Science", "Language Studies"};
    static String[] tuesdaySchedule = {"Computer Science", "Mathematics", "Language Studies", "Biology"};
    static String[] wednesdaySchedule = {"Language Studies", "Computer Science", "Mathematics", "Biology"};
    static String[] thursdaySchedule = {"Physics", "Computer Science", "Biology", "Mathematics"};
    static String[] fridaySchedule = {"Physics", "Computer Science", "Mathematics", "Biology"};


    public static void schedule(People students) {
        if (students instanceof Students) {
            Days[] days = ((Students) students).getWorkingDays();
            if (days != null) {
                for (Days d : days) {
                    if (d.equals(Days.MONDAY)) {
                        System.out.println("It is " + d.getName() + ". Your schedule is " + Arrays.toString(mondaySchedule));
                    }
                    if (d.equals(Days.TUESDAY)) {
                        System.out.println("It is " + d.getName() + ". Your schedule is " + Arrays.toString(tuesdaySchedule));
                    }
                    if (d.equals(Days.WEDNESDAY)) {
                        System.out.println("It is " + d.getName() + ". Your schedule is " + Arrays.toString(wednesdaySchedule));
                    }
                    if (d.equals(Days.THURSDAY)){
                        System.out.println("It is " + d.getName() + ". Your schedule is " + Arrays.toString(thursdaySchedule));
                    }
                    if (d.equals(Days.FRIDAY)) {
                        System.out.println("It is " + d.getName() + ". Your schedule is " + Arrays.toString(fridaySchedule));
                    }
                    if (d.equals(Days.SATURDAY) || d.equals(Days.SUNDAY)){
                        System.out.println(d.getName() + " is weekend!");
                    }
                }
            }
        }
    }
}