package com.arm.hoc_dagger2.model;

import com.arm.hoc_dagger2.model.trongMainActivity.XaiTrongMainActivity;

import javax.inject.Inject;

public class XaiTumLum extends BaseModel {
    @Inject
    XaiTrongMainActivity xaiTrongMainActivity;

    @Inject
    public XaiTumLum() {

    }

    public void abc() {
        xaiTrongMainActivity.logRa();
    }
}
