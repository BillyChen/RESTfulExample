package com.billy.rest;

import javax.ws.rs.core.Response;

public class MessageRestService implements MsgRestServiceInterface{

	public Response printMessage(String msg){
		String result = "Restful example - Billy.KKK.Cwind : " +msg;
		
		return Response.status(200).entity(result).build();
	}
	
}
