package com.arm.model.ex3.module;

import com.arm.model.ex3.model.Arm;
import com.arm.model.ex3.model.Cash;
import com.arm.model.ex3.scope.CustomScope;
import com.arm.model.ex3.model.Soldiers;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 15/11/17.
 */
@Module(includes = {ContextArmModule.class, ApplicationModule.class})
public class BraavosModule {

    @CustomScope
    @Provides
    public Arm getArm(Cash cash, Soldiers soldiers) {
        //lấy cash này ở
        //@Provides
        //Cash provideCash(){
        //    return new Cash();
        //}
        //khi chạy getArm thì nó cũng sẽ chạy provideCash để lấy ra Cash cung cấp cho getArm.
        cash.toast();
        return new Arm().setArm("abc");
    }

    @CustomScope
    @Provides
    Cash provideCash(@Named("ContextArmModule") String contextArmModule
            , @Named("ApplicationModule") String application){
        System.out.println(contextArmModule);
        System.out.println(application);
        return new Cash();
    }

    @Provides
    Soldiers provideSoldiers(){
        return new Soldiers();
    }

}
