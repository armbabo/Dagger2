package com.arm.model.ex2.component;

import com.arm.model.ex2.model.Arm;
import com.arm.model.ex2.model.Cash;
import com.arm.model.ex2.model.Soldiers;
import com.arm.model.ex2.model.Starks;
import com.arm.model.ex2.model.War;
import com.arm.model.ex2.module.BraavosModule;
import com.arm.model.ex2.scope.CustomScope;

import dagger.Component;

@CustomScope
// modules là để có thể lấy ra các Object có @Provides dc định nghĩa trong module ra xài bằng battleComponent.get ra.
@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldiers getSoldiers();
    Arm getArm();
    Starks getStarks();
}