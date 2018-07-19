package com.arm.hoc_dagger2.module.xaiTrongMainActivity;

import com.arm.hoc_dagger2.model.trongMainActivity.XaiTrongMainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class XaiTrongMainActivityModule {
    @Provides
    XaiTrongMainActivity getXaiTrongMainActivity() {
        return new XaiTrongMainActivity();
    }
}