package org.example.model;

import java.util.ArrayList;

/* Implementation of the activity interface that serves as an example for better understanding.
*  Takes as an argument the weekly schedule of the activity
* */
public class SwimmingPoolActivity implements Activity {

    private ArrayList<String> WeeklySchedule;

    public SwimmingPoolActivity(ArrayList<String> weeklySchedule) {
        this.WeeklySchedule = weeklySchedule;
    }

}
