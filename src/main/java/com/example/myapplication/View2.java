package com.example.myapplication;

import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Label;
//import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;

//@SpringView(name = "charts") // the path under which you can navigate to it
//@CDIView("charts")
//@MenuCaption("Charts")
@MenuIcon(VaadinIcons.COG)

public class View2 extends ExampleView {
    /**
	 * 
	 */
	private static final long serialVersionUID = -847157220813894209L;

	@Override
    VerticalLayout getView() {
		VerticalLayout vl = new VerticalLayout();
		Label lbl = new Label(getClass().getName());
		vl.addComponent(lbl);
        return vl;
    }
}
