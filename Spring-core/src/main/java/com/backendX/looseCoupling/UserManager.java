package com.backendX.looseCoupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
    // so whoever implements the interface will be able to use the UserManager

    public String getUserDetails(){
        return userDataProvider.getUserDetails();
    }
}
