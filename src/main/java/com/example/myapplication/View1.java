package com.example.myapplication;

import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.VerticalLayout;

@MenuIcon(VaadinIcons.HOME)
public class View1 extends ExampleView {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8120902053232284203L;

	@Override
	VerticalLayout getView() {
		
        final VerticalLayout layout = new VerticalLayout();
        
        CustomUploader cu = new CustomUploader();
        
   
        
        layout.addComponents(cu);
        
		
		
        return layout;
    }
	
}
