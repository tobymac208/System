package com.projects.codepractitioner.POJOs.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginAccountTest {

    @Test
    void testEquals() {
        // Create a variable to check against
        final boolean expected_boolean = true;

        // Properties for the objects
        final String username = "username";
        final String name = "their_name";
        final String password = "password";

        // Create two LoginAccount objects
        LoginAccount first_account = new LoginAccount(username, name, password);
        LoginAccount second_account = new LoginAccount(username, name, password);

        // Variable to check
        boolean objects_are_equal = first_account.equals(second_account);

        // Assert that the two boolean values are the same
        assertEquals(expected_boolean, objects_are_equal);
    }
}