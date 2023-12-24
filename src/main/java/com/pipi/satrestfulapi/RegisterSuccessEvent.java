package com.pipi.satrestfulapi;

import org.springframework.stereotype.Component;
@Component
public class RegisterSuccessEvent implements Event{

    @Override
    public String dispatch(String message) {
        return "register success event: " + message;
    }
}
