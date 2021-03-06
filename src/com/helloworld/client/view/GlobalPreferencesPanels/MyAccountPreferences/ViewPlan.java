package com.helloworld.client.view.GlobalPreferencesPanels.MyAccountPreferences;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.helloworld.client.view.GlobalPreferencesPanels.GlobalPreferencesPanels;
import com.helloworld.shared.entity.GlobalPreferencesEntity;

public class ViewPlan extends Composite implements GlobalPreferencesPanels {

	private static ViewPlanUiBinder uiBinder = GWT
			.create(ViewPlanUiBinder.class);

	interface ViewPlanUiBinder extends UiBinder<Widget, ViewPlan> {
	}
	@UiField CheckBox paymentDetails;
	@UiField CheckBox checkBoxPaymentPlan;
	@UiField CheckBox checkBoxMonthly;
	@UiField CheckBox checkBoxQuaterly;
	@UiField CheckBox checkBoxYearly;
	@UiField CheckBox checkShowThisPanel;
	
	public ViewPlan() {
		initWidget(uiBinder.createAndBindUi(this));
		setPaymentTermsLayout();
	}
	
	@SuppressWarnings("deprecation")
	public void updateFieldsWithAlreadySavedPreferences(GlobalPreferencesEntity alreadySavedGlobalPreferencesEntity){
		if(alreadySavedGlobalPreferencesEntity != null){
			paymentDetails.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isShowPaymentDetails());
			checkBoxPaymentPlan.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPaymentTerms());
			checkBoxMonthly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanMonthlyPayments());
			checkBoxQuaterly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanQuarterlyPayments());
			checkBoxYearly.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanYearlyPayments());
			checkShowThisPanel.setChecked(alreadySavedGlobalPreferencesEntity.getMyAccountPreferencesId().isViewPlanShowPanel());
		}
	}
	
	public void setPaymentTermsLayout(){
		checkShowThisPanel.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue() == true){
					enableAllFields();
				}else{
					disableAllFields();
				}
			}
		});
		
		checkBoxPaymentPlan.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if(event.getValue() == true){
					enablePaymentFields();
				}else{
					disablePaymentFields();
				}
			}

			
		});
	}


	public CheckBox getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(CheckBox paymentDetails) {
		this.paymentDetails = paymentDetails;
	}



	public CheckBox getCheckBoxPaymentPlan() {
		return checkBoxPaymentPlan;
	}

	public CheckBox getCheckBoxMonthly() {
		return checkBoxMonthly;
	}

	public CheckBox getCheckBoxQuaterly() {
		return checkBoxQuaterly;
	}

	public CheckBox getCheckBoxYearly() {
		return checkBoxYearly;
	}

	@Override
	public void disableAllFields() {
		paymentDetails.setChecked(false);
		paymentDetails.setEnabled(false);
		checkBoxPaymentPlan.setChecked(false);
		checkBoxPaymentPlan.setEnabled(false);
		checkBoxMonthly.setChecked(false);
		checkBoxMonthly.setEnabled(false);
		checkBoxQuaterly.setChecked(false);
		checkBoxQuaterly.setEnabled(false);
		checkBoxYearly.setChecked(false);
		checkBoxYearly.setEnabled(false);
		
	}

	@Override
	public void enableAllFields() {
		paymentDetails.setChecked(true);
		paymentDetails.setEnabled(true);
		checkBoxPaymentPlan.setChecked(true);
		checkBoxPaymentPlan.setEnabled(true);
		checkBoxMonthly.setChecked(true);
		checkBoxMonthly.setEnabled(true);
		checkBoxQuaterly.setChecked(true);
		checkBoxQuaterly.setEnabled(true);
		checkBoxYearly.setChecked(true);
		checkBoxYearly.setEnabled(true);
	}
	
	private void disablePaymentFields() {
		
		checkBoxMonthly.setChecked(false);
		checkBoxMonthly.setEnabled(false);
		checkBoxQuaterly.setChecked(false);
		checkBoxQuaterly.setEnabled(false);
		checkBoxYearly.setChecked(false);
		checkBoxYearly.setEnabled(false);
	}

	private void enablePaymentFields() {
		checkBoxMonthly.setChecked(true);
		checkBoxMonthly.setEnabled(true);
		checkBoxQuaterly.setChecked(true);
		checkBoxQuaterly.setEnabled(true);
		checkBoxYearly.setChecked(true);
		checkBoxYearly.setEnabled(true);
	}

	public CheckBox getCheckShowThisPanel() {
		return checkShowThisPanel;
	}

}
