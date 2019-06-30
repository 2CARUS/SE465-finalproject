package com.se465.pojo;

import lombok.Getter;
import lombok.Setter;

public class SubscriptionRequest implements HttpRequestObject {

	@Getter
	@Setter
	private String uid;
	@Getter
	@Setter
    private Reminder reminder;
	@Getter
	@Setter
    private String email;



    @Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", reminder = "+reminder+", email = "+email+"]";
    }
}
