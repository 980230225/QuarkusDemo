package com.shida;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class hello {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "git add hellofile";
    }
}
