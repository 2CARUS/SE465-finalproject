package com.se465.service;

import com.se465.pojo.ErrorResponse;
import com.se465.pojo.HttpResponseObject;

public abstract class AbstractEventController {
	public HttpResponseObject errorResponse(String e) {
		return new ErrorResponse(e);
	}
	
	public HttpResponseObject errorResponse(String e, String customMessage) {
		return new ErrorResponse(e, customMessage);
	}
}
