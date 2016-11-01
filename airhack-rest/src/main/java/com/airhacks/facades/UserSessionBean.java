/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.facades;

import javax.ejb.Stateless;

/**
 *
 * @author armen arzumanyan
 */
@Stateless
public class UserSessionBean {

    public String getSecretUserName(){
        return "armen@gmail.com";
    }
}
