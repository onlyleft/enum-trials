package com.adjenti.lab.enumeration;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BadRequestExceptionHandler implements ExceptionMapper<BadRequestException> {
    @Override
    public Response toResponse(final BadRequestException e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}
