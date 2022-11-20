package com.devbureau.demo.service;

import com.devbureau.demo.mapper.DeveloperEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class DevelopmentBureauTest {
    Bureau bureau = new DevelopmentBureau();

    @ParameterizedTest
    @EnumSource(DeveloperEnum.class)
    void develop(DeveloperEnum devUnderTest) {

        bureau.develop(devUnderTest);
    }
}