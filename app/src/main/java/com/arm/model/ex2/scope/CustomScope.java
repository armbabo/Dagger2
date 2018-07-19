package com.arm.model.ex2.scope;

import javax.inject.Scope;

//@Scope để mỗi khi lấy Object ra thì nó sẽ không phải new Object đó nữa
// nếu không dùng scope thì mỡi khi Component.get ra sẽ thành Object mới
@Scope
public @interface CustomScope {
}
