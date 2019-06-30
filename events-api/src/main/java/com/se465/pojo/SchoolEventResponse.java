package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class SchoolEventResponse implements HttpResponseObject {
	@Getter
	@Setter
	private Vevents event;

}
