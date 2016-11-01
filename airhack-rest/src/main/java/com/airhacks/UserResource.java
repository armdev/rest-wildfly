/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import com.airhacks.cdi.PersonBean;
import com.airhacks.facades.UserSessionBean;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("user")
@RequestScoped
public class UserResource {

    @Context
    private UriInfo context;
    
    @Inject
    private UserSessionBean sessionBean;
    
    @Inject
    private PersonBean personBean;

    /**
     * Creates a new instance of UserResource
     */
    public UserResource() {
    }

    /**
     * Retrieves representation of an instance of com.airhacks.UserResource
     * @return an instance of java.lang.String
     */
    // access http://localhost:8080/airhack-rest/resources/user/secret
    @GET
    @Path("/secret")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSecretUserName() {
        //TODO return proper representation object
       
        return sessionBean.getSecretUserName();
    }
    
    //http://localhost:8080/airhack-rest/resources/user/hidden
    
    @GET
    @Path("/hidden")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHiddenName() {
        //TODO return proper representation object
       
        return context.getPath();
    }
    
    @GET
    @Path("/hername")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHerName() {
        //TODO return proper representation object
       
        return personBean.getHerName();
    }

    /**
     * PUT method for updating or creating an instance of UserResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
