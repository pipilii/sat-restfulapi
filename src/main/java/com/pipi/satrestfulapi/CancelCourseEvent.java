package com.pipi.satrestfulapi;

import org.springframework.stereotype.Component;

@Component
public class CancelCourseEvent implements Event{
    @Override
    public String dispatch(String message) {
        return "cancel course event: " + message;
    }
}
