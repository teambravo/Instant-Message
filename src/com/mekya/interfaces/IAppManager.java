package com.mekya.interfaces;

public interface IAppManager {

	public String getUsername();

	public boolean sendMessage(String username, String message);

	public String authenticateUser(String usernameText, String passwordText);

	public void messageReceived(String message);

	// public void setUserKey(String value);
	public boolean isNetworkConnected();

	public boolean isUserAuthenticated();

	public String getLastRawFriendList();

	public void exit();

	public String signUpUser(String usernameText, String passwordText,
			String email);

	public String addNewFriendRequest(String friendUsername);

	public String sendFriendsReqsResponse(String approvedFriendNames,
			String discardedFriendNames);

}
