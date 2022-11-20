package com.devbureau.demo.service;


import com.devbureau.demo.mapper.DeveloperEnum;

@org.springframework.stereotype.Service
public class DevelopmentBureau implements Bureau {
    @Override
    public String develop(DeveloperEnum dev) {
        return implement(dev);
    }

    private String implement(DeveloperEnum dev) {
        switch (dev) {
            case JOE:
                return "JAVA";
            case John:
                return "Swift";
            case MARK:
                return "Angular";
            case TONY:
                return "Python";
            default:
                return "???";
        }

    }
}
