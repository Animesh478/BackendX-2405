package com.backendX.tightCoupling;

// this class takes the details from UserManager and plays with it
public class UserManager {
    // tight coupling
    UserDatabase userDatabase = new UserDatabase();

    public String manageUser(){
        return userDatabase.getUserDetails();
    }
}
