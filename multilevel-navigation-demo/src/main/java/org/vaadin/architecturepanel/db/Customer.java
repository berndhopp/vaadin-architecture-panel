package org.vaadin.architecturepanel.db;

public class Customer implements Entity{

    private final int id;
    private final String full_name;

    public Customer(int id, String full_name) {
        this.id = id;
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }
}
