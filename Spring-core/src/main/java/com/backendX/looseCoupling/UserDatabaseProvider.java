package com.backendX.looseCoupling;

// let's say this class interacts with a mysql database
public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "User details from database";
    }
}

// so if we have to interact with another database, we can create a class that
// will implement the UserDataProvider interface
// and we donot have to change anything in the other components