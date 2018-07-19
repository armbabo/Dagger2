package com.arm.model.ex3.model;

import com.arm.model.ex3.component.BattleComponent;
import com.arm.model.ex3.component.DaggerBattleComponent;

public class CheckPoint {
    public static BattleComponent getBattleComponent() {
        return DaggerBattleComponent
                .builder().build();
    }
}
