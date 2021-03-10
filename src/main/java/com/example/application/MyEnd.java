package com.example.application;

import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;

@Endpoint
@AnonymousAllowed
public class MyEnd {

    public void hello(FakePageable p) {

    }
}
