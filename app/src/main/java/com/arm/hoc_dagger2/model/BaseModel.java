package com.arm.hoc_dagger2.model;

import android.util.Log;

public class BaseModel {
    public void logRa() {
        Log.e("BaseModel", "logRa: " + this.getClass().getSimpleName());
    }
}
