package com.projects.codepractitioner.POJOs.Account;

import java.util.ArrayList;
import java.util.Collections;

public class LoginAccountList {
    private ArrayList<LoginAccount> loginAccounts;

    public LoginAccountList(){
        loginAccounts = new ArrayList<>();
    }

    /**
     * Pass in an instantiated LoginAccount.
     * Pre-condition: LoginAccount is initialized and is contained in the list/
     * Post-condition: Add that account and receive true.
     * @param loginAccount
     * @return
     */
    public boolean addAccount(LoginAccount loginAccount){
        for (LoginAccount currentAccount : loginAccounts) {
            if(currentAccount.getUsername().equals(loginAccount.getUsername())){
                return false;
            }
        }

        loginAccounts.add(loginAccount);
        return true;
    }

    /**
     * Pass in an instantiated LoginAccount.
     * Pre-condition: LoginAccount is initialized and is contained in the list.
     * Post-condition: Remove that account and receive true.
     * @param loginAccount
     * @return
     */
    public boolean removeAccount(LoginAccount loginAccount){
        for(int i = 0, length = loginAccounts.size(); i < length; i++){
            if(loginAccounts.get(i).getUsername().equals(loginAccount.getUsername())){
                loginAccounts.remove(i);
                return true;
            }
        }

        return false;
    }

    public ArrayList<LoginAccount> getLoginAccounts(){
        ArrayList<LoginAccount> newAccountList = new ArrayList<>();

        newAccountList.addAll(loginAccounts);

        return loginAccounts;
    }
}
