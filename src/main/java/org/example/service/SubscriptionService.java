package org.example.service;

import org.example.model.Activity;
import org.example.model.Member;
import org.example.model.SubscribedVisits;
import org.example.model.Subscription;

import java.util.ArrayList;

/* interface for each subscription service to implement. It contains
*  two methods that will be used by each implementation of this interface.
* */

public interface SubscriptionService {

    // takes all these parameters and returns a new subscription
    Subscription subscribe(Member member, Activity activity, SubscribedVisits subscribedVisits, ArrayList<String> chosenDates);

    // a functionality specified in the project paper for the change of the days and hours of the subscription.
    void changeChosenDates(String newChosenDate, Subscription subscription);
}
