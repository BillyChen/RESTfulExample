package com.billy.app;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import com.billy.rest.BookRestService;
import com.billy.rest.MessageRestService;
import com.billy.rest.UserRestService;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	
	public MessageApplication(){
		singletons.add(new MessageRestService());
		singletons.add(new UserRestService());
		singletons.add(new BookRestService());
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}

}
