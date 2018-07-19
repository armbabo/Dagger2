package com.arm.model.ex3.module;

import com.arm.model.ex3.model.LeaveApp;
import com.arm.model.ex3.scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class LeaveAppModule {
    @Provides
    @AppScope
    public Integer getInte(){
        return 100;
    }

    @Provides
    public LeaveApp getLeaveApp() {
        return new LeaveApp();
    }
}
