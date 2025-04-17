package com.backendX.tightCoupling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       UserManager userManager = new UserManager();
        System.out.println(userManager.manageUser());
    }
}
