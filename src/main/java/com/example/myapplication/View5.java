package com.example.myapplication;

//import com.github.appreciated.app.layout.annotations.MenuCaption;
import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.vaadin.icons.VaadinIcons;
//import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

//@SpringView(name = "menu") // the path under which you can navigate to it
//@CDIView("menu")
//@MenuCaption("Menu")
@MenuIcon(VaadinIcons.SPLINE_CHART)
public class View5 extends ExampleView {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8377524556094242896L;

	@Override
    VerticalLayout getView() {
		VerticalLayout vl = new VerticalLayout();
		Label lbl = new Label(getClass().getName());
		vl.addComponent(lbl);
        return vl;
    }
}
