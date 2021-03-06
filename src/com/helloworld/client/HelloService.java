package com.helloworld.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.helloworld.shared.entity.GlobalPreferencesEntity;
import com.helloworld.shared.entity.MyAccountEntity;
import com.helloworld.shared.entity.UserEntity;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface HelloService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	String addUser(UserEntity user) throws Exception;
	boolean verifyCaptcha(String challenge, String response)throws Exception;
	boolean verifySubscription(String email) throws Exception;
	UserEntity signIn(String userName, String password) throws Exception;
	String editUser(UserEntity user) throws Exception;
	ArrayList<String> readUploadedFiles() throws Exception;
	String fetchLogo() throws Exception;
	GlobalPreferencesEntity fetchGlobalPreferences() throws Exception;
	String updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity) throws Exception;
	String updateMyAccount (MyAccountEntity myAccountEntity)throws Exception;
	String logOut() throws Exception;
	String fetchUserStatus(String userName, String email) throws Exception;
	String inactivateAccount(String userName) throws Exception;
	String sendActivationEmailForgotPassword(String userName) throws Exception;
	boolean isLoggedInWithin20Mins(UserEntity user) throws Exception;
	UserEntity fetchNewUser(String createPasswordToken)throws Exception;
	String updatePassword(UserEntity user)throws Exception;
	String emailUserName(String email)throws Exception;
	ArrayList<UserEntity>fetchAllUsers()throws Exception;
	String updateUserAccount(UserEntity user)throws Exception;
	String closeAccount(UserEntity user) throws Exception;
	
}
