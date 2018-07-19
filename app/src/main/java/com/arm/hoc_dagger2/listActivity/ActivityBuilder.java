package com.arm.hoc_dagger2.listActivity;

import com.arm.hoc_dagger2.MainActivity;
import com.arm.hoc_dagger2.module.xaiTrongMainActivity.XaiTrongMainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//nơi chứa các Activity có thể xài @Inject
@Module
public abstract class ActivityBuilder {

    /*
    xài @ContributesAndroidInjector đối với Activity nào muốn xài @Inject có các module.
    *trong module sẽ chứa
    - @ContributesAndroidInjector sẽ là các Fragment trong Activity đó hoặc
    - @Provides là các Object để @Inject lấy ra xài trong Activity này
    cứ như vậy có thể lồng vào nhau tiếp, trong @ContributesAndroidInjector sẽ có thêm Module chẳng hạn
     */
    @ContributesAndroidInjector(modules = {XaiTrongMainActivityModule.class})
    abstract MainActivity bindMainActivity();
}
