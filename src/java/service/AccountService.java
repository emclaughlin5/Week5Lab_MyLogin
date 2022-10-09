/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.*;

/**
 *
 * @author Eric
 */
public class AccountService {

    public static User login(String username, String password) {
        if ((username.equals("abe") || username.equals("barb")) && password.equals("password")) {
            return new User(username, null);
        } else {
            return null;
        }
    }
}
