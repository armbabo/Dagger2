package com.arm.model.ex2.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextArmModule {

    private String context = "ContextArmModule show";

    @Named("ContextArmModule")
    @Provides
    public String getContext() {
        return context;
    }
}
