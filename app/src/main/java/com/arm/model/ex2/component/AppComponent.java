package com.arm.model.ex2.component;

import com.arm.model.ex2.module.LeaveAppModule;
import com.arm.model.ex2.scope.AppScope;

import dagger.Component;

@AppScope
@Component(modules = LeaveAppModule.class, dependencies = BattleComponent.class)
public interface AppComponent {
    // cái nầy để truyền class nào mình muốn xài @inject có trong class đó
    // nó sẽ lấy cái đã dc khởi tạo và trả về cho @Inject là sẽ xài dc cái có @Inject
//    void inject(RunApp runApp);
}
