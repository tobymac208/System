package com.projects.codepractitioner.POJOs.Account;

import java.io.InvalidClassException;

public class LoginAccount {
    private String username;
    private String name;
    private String password;

    public LoginAccount(String username, String name, String password){
        this.username = username;
        this.name = name;
        this.password = password;
    }

    /** GETTERS & SETTERS **/
    String getUsername() { return username; }
    void setUsername(String username) { this.username = username; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getPassword() { return password; }
    void setPassword(String password) { this.password = password; }

    /**
     * Checks to see if two objects have the same values.
     * Pre-condition: Pass in an initialized LoginAccount object.
     * Post-condition: Get a boolean value.
     * Throws: ClassCastException, NullPointerException
     */
    @Override
    public boolean equals(Object account) {
        // Verify there's data in the object
        if(account == null){
            throw new NullPointerException("Object was empty.");
        }

        // Let's create an object to check against
        LoginAccount objectToCheckAgainst = null;

        if(account instanceof LoginAccount){
            // objectToCheckAgainst is now an instance of the LoginAccount's version of our 'account' variable.
            objectToCheckAgainst = (LoginAccount)account;
        }else{
            throw new ClassCastException("Failed to cast the object.");
        }

        // Let's now see if they're the same object
        return objectToCheckAgainst.getUsername().equals(username) && objectToCheckAgainst.getName().equals(name) &&
                objectToCheckAgainst.getPassword().equals(password);
    }

    /**
     * Checks the account's by username.
     * Pre-condition: Pass in an initialized LoginAccount
     * Post-condition: Returns 1, 0, or -1.
     * Throws: NullPointerException
     */
    int compareTo(Object account){
        // Verify there's data in the object
        if(account == null){
            throw new NullPointerException("The object was null.");
        }

        LoginAccount accountToCheckAgainst = null;

        // Is 'account' an instance of LoginAccount?
        if(account instanceof LoginAccount){
            accountToCheckAgainst = (LoginAccount)account;
        }else{
            throw new ClassCastException("Failed to cast the object.");
        }

        // return the result of a call to this instance's username getting compared to the other account's.
        return username.compareTo(accountToCheckAgainst.getUsername());
    }
}
