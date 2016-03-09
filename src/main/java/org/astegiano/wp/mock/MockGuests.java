package org.astegiano.wp.mock;

import org.astegiano.wp.data.Guest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quentin on 09/03/2016.
 */
public class MockGuests {

    private static final List<Guest> guests = new ArrayList<>();

    private static void init() {
        if (guests.isEmpty()) {
            guests.add(new Guest("Tristan", "Loric", "tristan.loric@gmail.com"));
            guests.add(new Guest("Delphine", "Loric", "delphine.loric@gmail.com"));
            guests.add(new Guest("Clémence", "Chatré", "clemence.chatre@gmail.com"));
            guests.add(new Guest("Nicolas", "N'Guyen", "nicolas.nguyen@gmail.com"));
        }
    }

    public static List<Guest> get() {
        init();
        return guests;
    }
}
