package com.se465.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
public class Reminder {
	
	@NonNull
	@Getter
	@Setter	
    private String unit;
	
	@NonNull
	@Getter
	@Setter
    private String value;
	
    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", value = "+value+"]";
    }

}
