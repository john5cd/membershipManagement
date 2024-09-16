package org.example.service;

import org.example.model.Activity;
import org.example.model.Subscription;

import java.util.ArrayList;

// the base for all activity services

public interface ActivityService {

    // creates a new activity
    Activity create(ArrayList<String> weeklySchedule);

    /* a method for a member to change the weekly program of an activity. It takes as input the proposed
     new date and changes the schedule if that is possible */
    void changeWeeklyProgram(Subscription subscription, String proposedDate);
}
