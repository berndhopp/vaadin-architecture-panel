package org.vaadin.architecturepanel.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

public class ProductsView extends TabSheet implements View {

    private final Label start = new Label();
    private final Label categoryA = new Label();
    private final Label categoryB = new Label();

    public ProductsView(){
        addTab(start, "start");
        addTab(categoryA, "category a");
        addTab(categoryB, "category b");
        setSizeFull();
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        final String[] parameterParts = event.getParameters().split("/");

        if(parameterParts.length == 0){
            start.setCaption("");
            setSelectedTab(start);
            return;
        }

        String tabName = parameterParts[0];

        String subParam;

        if(parameterParts.length == 1){
            subParam = "no sub-parameters found";
        } else {
            subParam = parameterParts[1];
        }

        switch (tabName.toLowerCase()){
            case "a":
                categoryA.setValue(subParam);
                setSelectedTab(categoryA);
                break;
            case "b":
                categoryB.setValue(subParam);
                setSelectedTab(categoryB);
                break;
            default:
                start.setValue("could not find category '" + tabName + "'");
                setSelectedTab(start);
                break;
        }
    }
}
