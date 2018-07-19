package com.arm.hoc_dagger2.rootComponent;

import com.arm.hoc_dagger2.listActivity.ActivityBuilder;
import com.arm.hoc_dagger2.rootApp.RootApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

//những cái trong @Component(...) sẽ chứa những cái mà có thể @Inject ra xài dc
    //chú ý là phải có module AndroidInjectionModule.class của thư viện
@Singleton
@Component(modules = {AndroidInjectionModule.class, ActivityBuilder.class})
public interface AppRootComponent {

    void inject(RootApplication rootApplication);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder application(Application application);
//
//        AppRootComponent build();
//    }
}