package com.arm.model.ex2;


import com.arm.model.ex2.component.BattleComponent;
import com.arm.model.ex2.component.DaggerBattleComponent;
import com.arm.model.ex2.model.War;

/**
 * Created by Hari on 04/11/17.
 */

class RunApp {
    void run() {
        //cách 2
        /**
         * nếu xài appComponent.inject(this class);
         * thì sẽ có thể xài @Inject ra xài luôn
         */
//        AppComponent appComponent = DaggerAppComponent.builder()
//                .battleComponent(DaggerBattleComponent
//                .builder().build())
//                .build();
//        appComponent.inject(this class);
        //cách 1
        BattleComponent component = DaggerBattleComponent
                .builder().build();
        component.getStarks();
        War war = component.getWar();
        war.prepare();
        war.report();

//        component.getCash().toast();
//        component.getCash().toast();
//        component.getSoldiers().toast();
//        component = DaggerBattleComponent.builder().build();
        component.getArm().toast();
        //có xài Scope thì component.getCash() sẽ chỉ ra 1 Object hoy
        component.getCash();
        component.getCash();
        //không xài Scope thì mỗi lần component.getSoldiers() sẽ là 1 Object khác nhau
        component.getSoldiers();
        component.getSoldiers();
    }
}

public class BattleOfBastards {

    public static void main(String[] args){

        RunApp runApp = new RunApp();
        runApp.run();

    }
}


