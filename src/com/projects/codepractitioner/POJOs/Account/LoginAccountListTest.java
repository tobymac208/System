package com.projects.codepractitioner.POJOs.Account;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoginAccountListTest {
    private final LoginAccount defaultAccount = new LoginAccount("username1", "John Smith", "password1");

    @Test
    void addAccount() {
        // Create a value to check against
        final String expected_name = defaultAccount.getUsername();

        // Create a new list to use
        LoginAccountList newLoginAccountList = new LoginAccountList();

        // Add an item to the list
        newLoginAccountList.addAccount(defaultAccount);

        // Get the full list of items from our list object
        ArrayList<LoginAccount> loginAccounts = newLoginAccountList.getLoginAccounts();

        // Get the first item from 'loginAccounts'
        LoginAccount firstAccount = loginAccounts.get(0);

        // Make sure we got the correct item
        assertEquals(firstAccount.getUsername(), expected_name);
    }

    @Test
    void removeAccount() {
        // Create a value to check against
        final boolean removed = true;

        // Create a new list to use
        LoginAccountList newLoginAccountList = new LoginAccountList();

        // Add an item to the list
        newLoginAccountList.addAccount(defaultAccount);

        // Check to see if the item was successfully deleted
        boolean deleted = newLoginAccountList.removeAccount(defaultAccount);

        // Make sure we get the expected value: whatever 'removed' is
        assertEquals(removed, deleted);
    }

    @Test
    void getLoginAccounts() {
        // Create a value to check against
        final String expected_name = "second_username";

        // Create some accounts
        LoginAccount first = new LoginAccount("first_username", "first", "first_password");
        LoginAccount second = new LoginAccount(expected_name, "second", "second_password");
        LoginAccount third = new LoginAccount("third_username", "third", "third_password");

        // Create a list to use
        LoginAccountList theList = new LoginAccountList();

        // Add the accounts to the list
        theList.addAccount(first);
        theList.addAccount(second);
        theList.addAccount(third);

        // Grab the account list from our list
        ArrayList<LoginAccount> ourReturnedList = theList.getLoginAccounts();

        // Let's check the second object in our list
        assertEquals(expected_name, ourReturnedList.get(1).getUsername());
    }
}