package com.example.myapplication;

import com.vaadin.navigator.View;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public abstract class ExampleView extends HorizontalLayout implements View {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6963626764651823855L;

	public ExampleView() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();

        
        Panel panel = new Panel(getView());
        panel.setSizeFull();
        addComponent(panel);
        setMargin(true);
        setSizeFull();
    }

    abstract VerticalLayout getView();
}