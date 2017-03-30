package org.vaadin.architecturepanel.db;
public class User implements Entity {

    private final String firstName;
    private final String lastName;
    private final int userId;

    public User(String firstName, String lastName, int userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return userId;
    }
}
