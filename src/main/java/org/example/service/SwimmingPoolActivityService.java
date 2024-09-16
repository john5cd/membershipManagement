package org.example.service;

import org.example.model.*;
import java.util.ArrayList;

/* An implementation of the ActivityService. It serves as an example for better understanding
*  of the structure of the project.
* */

public class SwimmingPoolActivityService implements ActivityService {

    private SwimmingPoolActivity swimmingPoolActivity;
    private ArrayList<Member> members;

    @Override
    public Activity create(ArrayList<String> weeklySchedule) {
        swimmingPoolActivity = new SwimmingPoolActivity(weeklySchedule);
        return swimmingPoolActivity;
    }

    @Override
    public void changeWeeklyProgram(Subscription subscription, String proposedDate) {
        /* Checks if the subscription package has a swimming pool activity.
        *  Checks if the member is subscribed long enough, so they can change the weekly schedule.
        *  Checks if the proposed date is available.
        *  And finally changes the weekly schedule.
        * */
    }

}
