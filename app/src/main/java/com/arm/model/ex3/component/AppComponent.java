package com.arm.model.ex3.component;

import com.arm.model.ex3.RunApp;
import com.arm.model.ex3.module.LeaveAppModule;
import com.arm.model.ex3.scope.AppScope;

import dagger.Component;

@AppScope
@Component(modules = LeaveAppModule.class, dependencies = BattleComponent.class)
public interface AppComponent {
    // cái nầy để truyền class nào mình muốn xài @inject có trong class đó
    // nó sẽ lấy cái đã dc khởi tạo và trả về cho @Inject là sẽ xài dc cái có @Inject
    //phải để kiểu void thì mới hiểu
    void inject(RunApp runApp);
}
