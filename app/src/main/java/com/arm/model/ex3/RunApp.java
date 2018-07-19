package com.arm.model.ex3;


import com.arm.model.ex3.component.AppComponent;
import com.arm.model.ex3.component.DaggerAppComponent;
import com.arm.model.ex3.component.DaggerBattleComponent;
import com.arm.model.ex3.model.Cash;
import com.arm.model.ex3.model.LeaveApp;
import com.arm.model.ex3.model.War;

import javax.inject.Inject;

/**
 * Created by Hari on 04/11/17.
 */

public class RunApp {
    @Inject
    War war;
    @Inject
    Cash cash;
    @Inject
    LeaveApp leaveApp;

    void run() {
        //cách 2
        /**
         * nếu xài appComponent.inject(this class);
         * thì sẽ có thể xài @Inject ra xài luôn
         * xài dc hết mấy cái @Provides trong @Component của AppComponent
         */
        AppComponent appComponent = DaggerAppComponent.builder()
                .battleComponent(DaggerBattleComponent
                .builder().build())
                .build();
        appComponent.inject(this);

        cash.toast();
        war.prepare();
        leaveApp.setS("s").toast();
    }
}
 class BattleOfBastards {

    public static void main(String[] args){

        RunApp runApp = new RunApp();
        runApp.run();

    }
}


