package com.arm.model.ex2.model;

import com.arm.model.ex2.component.BattleComponent;
import com.arm.model.ex2.component.DaggerBattleComponent;

public class CheckPoint {
    public static BattleComponent getBattleComponent() {
        return DaggerBattleComponent
                .builder().build();
    }
}
