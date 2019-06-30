package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class SubscriptionResponse implements HttpResponseObject {
	
	@Getter
	@Setter
	private int status;
	
	@Getter
	@Setter
    private String sid;

	@Getter
	@Setter
    private SubscriptionRequest subscriptionRequest;
	
    @Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", sid = "+sid+", subscriptionRequest = "+subscriptionRequest+"]";
    }
}
