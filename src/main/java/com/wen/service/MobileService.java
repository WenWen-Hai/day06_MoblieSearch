package com.wen.service;



import com.wen.po.Mobile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public interface MobileService {
	
	@GET
	@Path("/search/{number}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
   public Mobile search(@PathParam("number") String number);
	
	
}
