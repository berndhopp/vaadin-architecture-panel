package org.vaadin.architecturepanel.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

public class DefaultView extends HorizontalLayout implements View {

    public DefaultView(){
        Button gotoProducts = new Button("go to products", (Button.ClickListener) event -> {
            UI.getCurrent().getNavigator().navigateTo("products");
        });

        Button gotoUsers = new Button("go to users", (Button.ClickListener) event -> {
            UI.getCurrent().getNavigator().navigateTo("users");
        });

        addComponents(gotoProducts, gotoUsers);
        setSpacing(true);
        setSizeFull();
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
