package school.impl;

import demo.Days;
import school.abstracts.People;

public class Utils {
    public static void schedule(People students){
        if(students instanceof Students){
            Days[] days = ((Students) students).getWorkingDays();
            if(days != null){
                for (Days d: days) {
                    if(d.equals(Days.MONDAY)||d.equals(Days.TUESDAY)||d.equals(Days.WEDNESDAY)||d.equals(Days.THURSDAY)||d.equals(Days.FRIDAY)){
                         System.out.println("It is " + d.getName() + ". Your schedule is " + d.getSubject(0) + " " + d.getSubject(1)  + " " + d.getSubject(2)  + " " +  d.getSubject(3));
                    }
                         System.out.println(d.getName() + " is weekend!");
                }
            }
        }
    }
}
