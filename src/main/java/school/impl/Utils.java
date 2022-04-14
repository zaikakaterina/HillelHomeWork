package school.impl;

import demo.Days;
import school.abstracts.People;

public class Utils {

    static String[] mondaySchedule = {"Mathematics,", "Literature,", "Computer Science,", "Language Studies."};
    static String[] tuesdaySchedule = {"Computer Science,", "Mathematics,", "Language Studies,", "Biology."};
    static String[] wednesdaySchedule = {"Language Studies,", "Computer Science,", "Mathematics,", "Biology."};
    static String[] thursdaySchedule = {"Physics,", "Computer Science,", "Biology,", "Mathematics."};
    static String[] fridaySchedule = {"Physics,", "Computer Science,", "Mathematics,", "Biology."};
    static String delimiter = " ";

    public static void schedule(People students) {
        if (students instanceof Students) {
            Days[] days = ((Students) students).getWorkingDays();
            if (days != null) {
                for (Days d : days) {
                    switch (d) {
                        case MONDAY:
                            printSchedule(mondaySchedule, d);
                            break;
                        case TUESDAY:
                            printSchedule(tuesdaySchedule, d);
                            break;
                        case WEDNESDAY:
                            printSchedule(wednesdaySchedule, d);
                            break;
                        case THURSDAY:
                            printSchedule(thursdaySchedule, d);
                            break;
                        case FRIDAY:
                            printSchedule(fridaySchedule, d);
                            break;
                        case SATURDAY:
                        case SUNDAY:
                            System.out.println(d.getName() + " is weekend!");
                    }
                }
            }
        }
    }
    private static void printSchedule(String[] scheduleArray, Days d){
        System.out.println("It is " + d.getName() + ". Your schedule is " + String.join(delimiter, scheduleArray));

    }

}
