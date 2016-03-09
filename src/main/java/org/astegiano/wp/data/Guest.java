package org.astegiano.wp.data;

import org.astegiano.wp.utils.StringUtils;

import java.text.Normalizer;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Created by Quentin on 09/03/2016.
 */
public class Guest {

    private final String firstName;
    private final String lastName;
    private final String email;

    public Guest(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getKey() {
        return StringUtils.normalize(firstName + " " + lastName);
    }
}
