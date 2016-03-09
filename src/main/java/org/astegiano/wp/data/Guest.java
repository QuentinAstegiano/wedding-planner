package org.astegiano.wp.data;

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
}
