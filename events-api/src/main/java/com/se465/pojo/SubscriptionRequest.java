package com.se465.pojo;

import lombok.Getter;
import lombok.Setter;

public class SubscriptionRequest implements HttpRequestObject,HttpResponseObject {

	@Getter
	@Setter
	private String uid;
	@Getter
	@Setter
    private String email;
	@Getter
	@Setter
    private Reminder reminder;




    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", reminder = "+reminder+", email = "+email+"]";
    }
}
