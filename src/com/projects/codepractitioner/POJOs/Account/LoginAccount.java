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
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    /** Checks to see if two objects have the same values.
     * Pre-condition: Pass in an initialized LoginAccount object.
     * Post-condition: Get a boolean value.
     * Throws: ClassCastException, NullPointerException */
    public boolean equals(Object obj) {
        // Verify there's data in the object
        if(obj == null){
            throw new NullPointerException("Object was empty.");
        }

        // Let's create an object to check against
        LoginAccount objectToCheckAgainst = null;

        if(obj instanceof LoginAccount){
            // objectToCheckAgainst is now an instance of the LoginAccount's version of our 'obj' variable.
            objectToCheckAgainst = (LoginAccount)obj;
        }else{
            throw new ClassCastException("Failed to cast the object.");
        }

        // Let's now see if they're the same object
        if(objectToCheckAgainst.getUsername().equals(username) && objectToCheckAgainst.getName().equals(name) &&
        objectToCheckAgainst.getPassword().equals(password)){
            // They're the same
            return true;
        }

        // Not the same object
        return false;
    }
}
