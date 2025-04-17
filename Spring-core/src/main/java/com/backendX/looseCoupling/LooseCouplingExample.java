package com.backendX.looseCoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserDataProvider userWebServiceProvider  = new WebServiceProvider();

        UserManager userManager = new UserManager(userDatabaseProvider);
        System.out.println(userManager.getUserDetails());

        UserManager userManagerWS = new UserManager(userWebServiceProvider);
        System.out.println(userManagerWS.getUserDetails());
    }
}
