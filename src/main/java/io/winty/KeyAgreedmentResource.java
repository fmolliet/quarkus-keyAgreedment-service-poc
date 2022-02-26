package io.winty;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/keys")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class KeyAgreedmentResource {
    
    @Inject
    KeyAgreedmentService keyExchange;

    @POST
    public Response keys( Request body ) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        System.out.println(keyExchange.exchange("string"));
        
        io.winty.Response response = new io.winty.Response("teste", "1234");

        return Response.ok(response).build();
    }
}