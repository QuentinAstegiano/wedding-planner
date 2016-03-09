package org.astegiano.wp.dao;

import com.google.common.base.Optional;
import org.astegiano.wp.data.Circle;
import org.astegiano.wp.mock.MockDatas;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quentin on 09/03/2016.
 */
public class CircleDao {

    private List<Circle> getAll() {
        return MockDatas.getCircles();
    }

    public List<Circle> getGuestCicle(String guestKey) {
        return getAll().stream()
                    .filter(c -> c.getGuestKeys().contains(guestKey))
                    .collect(Collectors.toList());
    }

    public List<Circle> getAllCircles(Optional<String> filter) {
        if (filter.isPresent()) {
            final String f = filter.get().toLowerCase();
            return getAll().stream()
                        .filter(c -> c.getName().toLowerCase().contains(f))
                        .collect(Collectors.toList());
        } else {
            return getAll();
        }
    }
}
