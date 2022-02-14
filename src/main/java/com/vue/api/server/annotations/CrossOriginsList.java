package com.vue.api.server.annotations;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@CrossOrigin
public @interface CrossOriginsList {
    public String[] crossOrigins() default  {
            "http://localhost:8081/", "http://localhost:8082/"
    };
}

