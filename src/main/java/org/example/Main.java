package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // just an example of the implementation

        MemberService memberService = new MemberService();
        Member jim =  memberService.create("jim", "james", "jim@gmail.com", 6944784512L, 27);

        ActivityService swimmingPoolActivityService = new SwimmingPoolActivityService();
        Activity swimmingPoolActivity = swimmingPoolActivityService.create(new ArrayList<>(Arrays.asList("Monday 3-5", "Friday 4-6")));

        SubscriptionService swimmingPoolSubscriptionService = new SwimmingPoolSubscriptionService();
        swimmingPoolSubscriptionService.subscribe(jim, swimmingPoolActivity, SubscribedVisits.EIGHT_VISITS_SUBSCRIPTION, new ArrayList<>(Arrays.asList("Monday 3-5")));

    }
}