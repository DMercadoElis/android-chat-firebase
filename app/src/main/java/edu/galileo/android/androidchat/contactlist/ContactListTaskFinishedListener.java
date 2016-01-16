package edu.galileo.android.androidchat.contactlist;

import edu.galileo.android.androidchat.entities.User;

/**
 * Created by ykro.
 */
public interface ContactListTaskFinishedListener {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
