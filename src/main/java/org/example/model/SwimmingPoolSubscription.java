package org.example.model;

import java.util.ArrayList;

/* Implementation of the subscription interface that serves as an example for better understanding.
 *  It is the class connecting members and the swimming pool activity. It takes those to as arguments
 *  as well as subscribed visits (8 or 15) and the days and hours the member chose to attend of those available
 * */
public class SwimmingPoolSubscription implements Subscription {
    private Activity activity;
    private Member member;
    private SubscribedVisits subscribedVisits;
    private ArrayList<String> chosenDates;

    /* This attribute keeps track of the number of the subscribed members, so they don't exceed the maximum number 6.
    *  It increments each time a new subscription is created and in a full implementation of this scenario it
    *  should throw an exception if that number is reached so no other member can subscribe. This functionality
    *  would be added in the subscription service.
    * */
    public static int membersSubscribed = 0;

    public SwimmingPoolSubscription(Activity activity, Member member, SubscribedVisits subscribedVisits, ArrayList<String> chosenDates) {
        this.activity = activity;
        this.member = member;
        this.subscribedVisits = subscribedVisits;
        this.chosenDates = chosenDates;

        membersSubscribed++;
    }
}
