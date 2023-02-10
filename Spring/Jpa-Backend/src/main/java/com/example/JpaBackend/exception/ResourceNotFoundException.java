package com.example.JpaBackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String feildName;
    private Object feildValue;

    public ResourceNotFoundException(String resourceName, String feildName, Object feildValue) {

        this.resourceName = resourceName;
        this.feildName = feildName;
        this.feildValue = feildValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFeildName() {
        return feildName;
    }

    public Object getFeildValue() {
        return feildValue;
    }
}
