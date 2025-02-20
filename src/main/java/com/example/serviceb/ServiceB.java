package com.example.serviceb;

import com.example.servicea.ServiceA;

public class ServiceB {
    public static String getVersion() {
        return "Service B is 1.0.0 consuming " + ServiceA.getVersion();
    }
}

