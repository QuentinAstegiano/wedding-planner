package org.astegiano.wp.mock;

import org.astegiano.wp.data.Circle;
import org.astegiano.wp.data.Guest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Quentin on 09/03/2016.
 */
public class MockDatas {

    private static final List<Guest> guests = new ArrayList<>();
    private static final List<Circle> circles = new ArrayList<>();

    private static void init() {
        if (guests.isEmpty()) {
            Guest tristan = new Guest("Tristan", "Loric", "tristan.loric@gmail.com");
            Guest delphine = new Guest("Delphine", "Loric", "delphine.loric@gmail.com");
            Guest clemence = new Guest("Clémence", "Chatré", "clemence.chatre@gmail.com");
            Guest nicolas = new Guest("Nicolas", "N'Guyen", "nicolas.nguyen@gmail.com");

            guests.add(tristan);
            guests.add(delphine);
            guests.add(clemence);
            guests.add(nicolas);

            Set<String> amis = new HashSet<>();
            amis.add(tristan.getKey());
            amis.add(delphine.getKey());
            amis.add(clemence.getKey());
            amis.add(nicolas.getKey());
            Set<String> famille = new HashSet<>();
            famille.add(clemence.getKey());
            famille.add(nicolas.getKey());

            circles.add(new Circle("amis", amis));
            circles.add(new Circle("famille", famille));
        }
    }

    public static List<Guest> getGuests() {
        init();
        return guests;
    }

    public static List<Circle> getCircles() {
        init();
        return circles;
    }
}
