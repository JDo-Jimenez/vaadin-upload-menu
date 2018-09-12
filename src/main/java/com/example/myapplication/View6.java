package com.example.myapplication;

//import com.github.appreciated.app.layout.annotations.MenuCaption;
import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.vaadin.icons.VaadinIcons;
//import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

//@SpringView(name = "elements") // the path under which you can navigate to it
//@CDIView("elements")
//@MenuCaption("Elements")
@MenuIcon(VaadinIcons.HOME)
public class View6 extends ExampleView {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8705934724110022390L;

	@Override
    VerticalLayout getView() {
		VerticalLayout vl = new VerticalLayout();
		Label lbl = new Label(getClass().getName());
		vl.addComponent(lbl);
        return vl;
    }
}
