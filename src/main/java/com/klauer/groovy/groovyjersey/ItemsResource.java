/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.klauer.groovy.groovyjersey;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author klauer
 */

@Path("/Items")
public class ItemsResource {
    @Context
    private UriInfo context;

    /** Creates a new instance of ItemsResource */
    public ItemsResource() {
    }

    /**
     * Retrieves representation of an instance of com.klauer.groovy.groovyjersey.ItemsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object

        throw new UnsupportedOperationException("We Made it!");
    }

    /**
     * POST method for creating an instance of ItemsResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    public javax.ws.rs.core.Response postXml(String content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for  {id}
     */
    @Path("{id}")
    public ItemResource getItemResource() {
        return new ItemResource();
    }
}

