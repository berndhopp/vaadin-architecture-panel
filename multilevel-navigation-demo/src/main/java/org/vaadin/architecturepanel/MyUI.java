package org.vaadin.architecturepanel;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import org.vaadin.architecturepanel.views.DefaultView;
import org.vaadin.architecturepanel.views.ProductsView;
import org.vaadin.architecturepanel.views.UsersView;

import javax.servlet.annotation.WebServlet;

@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        Navigator navigator = new Navigator(this, this);

        navigator.addView("", new DefaultView());
        navigator.addView("users", new UsersView());
        navigator.addView("products", new ProductsView());

        setNavigator(navigator);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
