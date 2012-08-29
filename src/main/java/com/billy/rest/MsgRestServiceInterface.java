package com.billy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/")
public interface MsgRestServiceInterface {

	@GET
	@Path("/{param}")
//	public Response printMessage(String param);
	public Response printMessage(@PathParam("param") String msg);
	
}
