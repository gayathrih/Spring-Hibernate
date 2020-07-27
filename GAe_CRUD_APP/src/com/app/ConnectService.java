package com.app;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class ConnectService {

	static {
		ObjectifyService.factory().register(Book.class);
		
	}
	
	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}
}
