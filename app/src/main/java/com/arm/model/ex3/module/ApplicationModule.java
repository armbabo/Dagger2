package com.arm.model.ex3.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private String context = "ApplicationModule show";

    @Named("ApplicationModule")
    @Provides
    public String getContext() {
        return context;
    }
}
