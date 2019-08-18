package com.projects.codepractitioner;

import com.projects.codepractitioner.POJOs.Database.DatabaseConnection;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        System.out.println("\"The System\" is currently under construction.");
        System.out.println();
        System.out.println("Description: \"The System\" is a program that runs on a local network (i.e., intranet) and contains functionality for\n" +
                "numerous tasks: login system, feeding scheduling, personal scheduling, and reminders.\n" +
                "NOTE: This program is meant to be run by a household and shouldn't be directly connected to the internet.\n" +
                "\n" +
                "Author: Nik\n" +
                "\n" +
                "Date created: 07/01/2019");

        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.writeToDatabase();
    }
}
