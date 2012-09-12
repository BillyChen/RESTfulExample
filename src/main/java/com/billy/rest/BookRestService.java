package com.billy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/books")
public class BookRestService {

	@Context
	private UriInfo uriInfo;

	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		return Response
				.status(200)
				.entity("getBooks is called, year : " + year + ", author : "
						+ author + ", country : " + country + "<br>***path: "
						+ uriInfo.getPath() + "<br>***absolutePath: "
						+ uriInfo.getAbsolutePath() + "<br>***baseuri: "
						+ uriInfo.getBaseUri()).build();

	}

}