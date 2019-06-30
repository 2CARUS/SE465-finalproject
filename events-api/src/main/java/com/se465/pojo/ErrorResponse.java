package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class ErrorResponse implements HttpResponseObject {

	@Setter
	@Getter
	private String errorStackStrace;
	@Setter
	@Getter
	private String errorCustomMessage = "none";
	public ErrorResponse(String e) {
		// TODO Auto-generated constructor stub
		this.errorStackStrace = e;
	}
	
	
}
