package com.billy.app;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
import com.billy.rest.UserRestService;

public class UserApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	
	public UserApplication(){
		singletons.add(new UserRestService());
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}
	
}
