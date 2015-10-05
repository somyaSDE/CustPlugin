package com.oro.orderextension;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JTabbedPane;

import com.floreantpos.bo.ui.BackOfficeWindow;
import com.floreantpos.customer.CustomerExplorer;

public class CustomerExplorerAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7818075409452485741L;

	public CustomerExplorerAction() {
		super("Customer");
	}

	public CustomerExplorerAction(String name) {
		super(name);
	}

	public CustomerExplorerAction(String name, Icon icon) {
		super(name, icon);
	}

	public void actionPerformed(ActionEvent e) {
		BackOfficeWindow backOfficeWindow = BackOfficeWindow.getInstance();

		CustomerExplorer explorer = null;
		JTabbedPane tabbedPane = backOfficeWindow.getTabbedPane();
		int index = tabbedPane.indexOfTab("Customer");
		if (index == -1) {
			explorer = new CustomerExplorer();
			tabbedPane.addTab("Customer", explorer);
		} else {
			explorer = (CustomerExplorer) tabbedPane.getComponentAt(index);
		}
		tabbedPane.setSelectedComponent(explorer);
	}

}

/*
 * Location:
 * C:\Users\SOMYA\Desktop\divya\orocust-0.7.jar!\com\oro\orderextension
 * \CustomerExplorerAction.class Java compiler version: 5 (49.0) JD-Core
 * Version: 0.7.1
 */