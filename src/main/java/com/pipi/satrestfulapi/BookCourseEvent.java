package com.pipi.satrestfulapi;

import org.springframework.stereotype.Component;

@Component
public class BookCourseEvent implements Event {
    @Override
    public String dispatch(String message) {
        return "book course event: " + message;
    }
}
