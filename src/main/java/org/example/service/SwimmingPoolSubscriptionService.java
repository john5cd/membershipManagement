package org.example.service;

import org.example.model.*;

import java.util.ArrayList;

/* An implementation of the ActivityService. It serves as an example for better understanding
 *  of the structure of the project.
 * */

public class SwimmingPoolSubscriptionService implements SubscriptionService {

    // creates a subscription for the swimming pool. In a real implementation it would check if the chosen dates are available and throw an exception otherwise.
    @Override
    public Subscription subscribe(Member member, Activity activity, SubscribedVisits subscribedVisits, ArrayList<String> chosenDates) {
        return (Subscription) new SwimmingPoolSubscription(activity, member, subscribedVisits, chosenDates);
    }

    // change the days and hours a member subscribed to.
    @Override
    public void changeChosenDates(String newChosenDate, Subscription subscription) {
        // changes the dates of the subscription for new ones, if possible
    }
}
