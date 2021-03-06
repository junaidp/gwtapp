package com.helloworld.client.view.CenterPanels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.presenter.DashboardPresenter.Display;
import com.helloworld.client.view.MyDashboard.MyAccountPanel;

public class DashboardView extends Composite implements Display {

	private static DashboardViewUiBinder uiBinder = GWT
			.create(DashboardViewUiBinder.class);

	interface DashboardViewUiBinder extends UiBinder<Widget, DashboardView> {
	}
	
	
	@UiField
	MyAccountPanel myAccount;
	
	public DashboardView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public MyAccountPanel getMyAccount() {
		return myAccount;
	}

	

}
