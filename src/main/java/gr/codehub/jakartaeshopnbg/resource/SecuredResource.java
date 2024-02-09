package gr.codehub.jakartaeshopnbg.resource;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/secured")
public class SecuredResource {
    @GET
    @PermitAll
    public String open(){
        return "open to all";
    }

    @GET
    @Path("/auth")
    @RolesAllowed("ADMIN")
    public String authenticated(){
        return "you are authenticated";
    }
}
