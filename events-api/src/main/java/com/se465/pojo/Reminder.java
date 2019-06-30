package com.se465.pojo;

import lombok.Getter;
import lombok.Setter;


public class Reminder {
	
	@Getter
	@Setter	
    private String unit;
	
	@Getter
	@Setter
    private String value;
	
    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", value = "+value+"]";
    }

}
