package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addUser(UserEntity user, AsyncCallback<String> callback);
	void verifyCaptcha(String challenge, String response, AsyncCallback<Boolean> callback);
	void verifySubscription(String email, AsyncCallback<Boolean> callback);
	void signIn(String userName, String password, AsyncCallback<UserEntity> callback);
	void editUser(UserEntity user, AsyncCallback<String> callback);
	void readUploadedFiles( AsyncCallback<ArrayList<String>> callback);
	void fetchLogo(AsyncCallback<String> callback);
	void fetchGlobalPreferences(AsyncCallback<GlobalPreferencesEntity> callback);
	void updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity, AsyncCallback<String> callback);
	void updateMyAccount(MyAccountEntity myAccountEntity, AsyncCallback<String> callback);
	void logOut(AsyncCallback<String> callback);
	void fetchUserStatus(String userName, String email, AsyncCallback<String> callback);
	void inactivateAccount (String userName, AsyncCallback<String> callback);
	void sendActivationEmailForgotPassword(String userName,AsyncCallback<String> callback);
	void isLoggedInWithin20Mins(UserEntity user,AsyncCallback<Boolean> asyncCallback);
	void fetchNewUser(String createPasswordToken, AsyncCallback<UserEntity> asyncCallback);
	void updatePassword(UserEntity user, AsyncCallback<String> asyncCallback);
	void emailUserName(String email, AsyncCallback<String> asyncCallback);
	void fetchAllUsers(AsyncCallback<ArrayList<UserEntity>> asyncCallback);
	void updateUserAccount(UserEntity user, AsyncCallback<String> asyncCallback);
	void closeAccount(UserEntity user, AsyncCallback<String> asyncCallback);
}
