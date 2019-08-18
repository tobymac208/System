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

    @Test
    void testCompareTo(){
        // Variable to check against
        final int expected_value = 0;
        final int unexpected_value = 0;

        // LoginAccounts to use
        LoginAccount first_account = new LoginAccount("my_username", "some_name", "my_password");
        LoginAccount second_account = new LoginAccount("their_username", "some_name", "their_password");
        LoginAccount third_account = new LoginAccount("my_username", "some_name", "the_other_password");

        // Values should be the same
        int first_value = first_account.compareTo(third_account);
        assertEquals(expected_value, first_value);

        // Values should be different
        int second_value = first_account.compareTo(second_account);
        assertNotEquals(unexpected_value, second_value);
    }
}