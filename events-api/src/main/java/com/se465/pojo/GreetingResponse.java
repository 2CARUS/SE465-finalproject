package com.se465.pojo;

public class GreetingResponse implements HttpResponseObject{

    private final long id;
    private final String content;

    public GreetingResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
