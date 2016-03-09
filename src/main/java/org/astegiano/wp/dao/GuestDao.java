package org.astegiano.wp.dao;

import com.google.common.base.Optional;
import org.astegiano.wp.data.Guest;
import org.astegiano.wp.mock.MockGuests;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quentin on 09/03/2016.
 */
public class GuestDao {

    private List<Guest> getAll() {
        return MockGuests.get();
    }

    public List<Guest> getAllGuests(Optional<String> filter) {
        if (filter.isPresent()) {
            final String f = filter.get().toLowerCase();
            return getAll().stream()
                        .filter(g ->
                                    g.getFirstName().toLowerCase().contains(f) ||
                                    g.getLastName().toLowerCase().contains(f))
                        .collect(Collectors.toList());
        } else {
            return getAll();
        }
    }
}
