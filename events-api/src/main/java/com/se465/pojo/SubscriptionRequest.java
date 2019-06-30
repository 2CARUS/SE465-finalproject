package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
public class SubscriptionRequest implements HttpRequestObject,HttpResponseObject {

	@Getter
	@Setter
	@NonNull
	private String uid;
	@Getter
	@Setter
	@NonNull
    private String email;
	@Getter
	@Setter
	@NonNull
    private Reminder reminder;



	
	@Override
    public String toString()
    {
        return "ClassPojo [uid = "+uid+", reminder = "+reminder+", email = "+email+"]";
    }
}
