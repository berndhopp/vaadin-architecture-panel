package org.vaadin.architecturepanel.views;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;

import org.vaadin.architecturepanel.db.User;

class UserDetails extends FormLayout {

    private final Label userIdLabel = new Label();
    private final Label firstNameLabel = new Label();
    private final Label lastNameLabel = new Label();

    UserDetails() {
        userIdLabel.setCaption("user id");
        firstNameLabel.setCaption("first name");
        lastNameLabel.setCaption("last name");

        addComponents(userIdLabel, firstNameLabel, lastNameLabel);
    }

    void setUser(User user){
        userIdLabel.setValue("" + user.getId());
        firstNameLabel.setValue(user.getFirstName());
        lastNameLabel.setValue(user.getLastName());
    }
}
