package com.arm.model.ex2.module;

import com.arm.model.ex2.scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class LeaveAppModule {
    @Provides
    @AppScope
    public Integer getInte(){
        return 100;
    }
}
