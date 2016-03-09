package org.astegiano.wp.data;

import java.util.List;
import java.util.Set;

/**
 * Created by Quentin on 09/03/2016.
 */
public class Circle {

    private final String name;
    private final Set<String> guestKeys;

    public Circle(String name, Set<String> guestKeys) {
        this.name = name;
        this.guestKeys = guestKeys;
    }

    public String getName() {
        return name;
    }

    public Set<String> getGuestKeys() {
        return guestKeys;
    }
}
