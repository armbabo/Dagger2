package com.arm.hoc_dagger2.rootApp;

import android.app.Activity;
import android.app.Application;

import com.arm.hoc_dagger2.rootComponent.AppRootComponent;
import com.arm.hoc_dagger2.rootComponent.DaggerAppRootComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

// cái này chạy đầu tiên sẽ nạp zô bộ nhớ
public class RootApplication extends Application implements HasActivityInjector {

    //tại cấp Application sẽ nói rằng, các Activity class sẽ có thể xài các @Inject
    //được khởi tạo trong các module
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        //các module ở đây
        //những cái có thể xài @Inject sẽ dc cung cấp ở đây
        //vào AppComponent để xem comment tiếp
        AppRootComponent appRootComponent = DaggerAppRootComponent.builder()
                .application(this)
                .build();
        appRootComponent.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
