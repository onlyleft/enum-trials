package com.adjenti.lab.enumeration;

import javax.ws.rs.*;

@Path("echo")
public class EnumResource {

    @GET
    public PossibleValue value() {
        return PossibleValue.Charlie;
    }

    @POST
    public String echo(String value) {
        return value;
    }

    @PUT
    public String echoValue(EnumRequest request) {
        final PossibleValue possibleValue = request.getValue();
        if (possibleValue == PossibleValue.Unknown) {
            throw new BadRequestException("INVALID_VALUE");
        }
        return possibleValue.name();
    }
}
