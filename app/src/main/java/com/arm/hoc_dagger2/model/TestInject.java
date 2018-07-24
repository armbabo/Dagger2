package com.arm.hoc_dagger2.model;

import com.arm.hoc_dagger2.model.trongMainActivity.XaiTrongMainActivity;

import javax.inject.Inject;

public class TestInject extends BaseModel{
    @Inject
    XaiTrongMainActivity xaiTrongMainActivity;

    @Inject
    public TestInject(XaiTrongMainActivity xaiTrongMainActivity) {
        //do XaiTrongMainActivity đã dc inject rồi nên sẽ lấy ra dc, xem XaiTrongMainActivityModule
        xaiTrongMainActivity.logRa();
    }

    public void abc() {
        xaiTrongMainActivity.logRa();
    }
}
