/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.cdi;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Admin
 */
@Named
@SessionScoped
public class PersonBean implements Serializable {
    
    
    public String getHerName(){
        return "Luna";
    }
    
}
