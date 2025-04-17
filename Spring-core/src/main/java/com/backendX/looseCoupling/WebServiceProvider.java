package com.backendX.looseCoupling;

public class WebServiceProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "User details from Web Service";
    }
}
