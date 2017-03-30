package org.vaadin.architecturepanel.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import org.vaadin.architecturepanel.db.Dao;
import org.vaadin.architecturepanel.db.User;

import java.util.Optional;

import static java.lang.Integer.parseInt;

public class UsersView extends CustomComponent implements View {

    private final UserMaster userMaster = new UserMaster();
    private final UserDetails userDetails = new UserDetails();

    public UsersView(){
        setCompositionRoot(userMaster);
        userMaster.addItemClickListener(event -> UI.getCurrent().getNavigator().navigateTo("users/" + event.getItem().getId()));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        String parameters = event.getParameters();

        if(parameters.isEmpty()){
            setCompositionRoot(userMaster);
        } else {
            int userId = parseInt(parameters);

            final Optional<User> userOptional = Dao.USER_DAO.get(userId);

            if(userOptional.isPresent()){
                userDetails.setUser(userOptional.get());
                setCompositionRoot(userDetails);
            } else {
                setCompositionRoot(new Label("userId" + userId + " not present"));
            }
        }
    }
}
