package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
public class SubscriptionResponse implements HttpResponseObject {
	
	@Getter
	@Setter
	private int status;
	
	@Getter
	@Setter
	@NonNull
    private String sid;

	@Getter
	@Setter
	@NonNull
    private SubscriptionRequest subscriptionRequest;
	

	@Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", sid = "+sid+", subscriptionRequest = "+subscriptionRequest+"]";
    }
}
