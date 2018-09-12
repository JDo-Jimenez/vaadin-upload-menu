package com.example.myapplication;

//import com.github.appreciated.app.layout.annotations.MenuCaption;
import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.vaadin.icons.VaadinIcons;
//import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

//@SpringView(name = "more") // the path under which you can navigate to it
//@CDIView("more")
//@MenuCaption("More")
@MenuIcon(VaadinIcons.PLUS)
public class View4 extends ExampleView {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8301649386770856362L;

	@Override
    VerticalLayout getView() {
		VerticalLayout vl = new VerticalLayout();
		Label lbl = new Label(getClass().getName());
		vl.addComponent(lbl);
        return vl;
    }
}
