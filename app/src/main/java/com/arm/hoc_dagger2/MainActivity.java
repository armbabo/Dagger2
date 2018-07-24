package com.arm.hoc_dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arm.hoc_dagger2.model.TestInject;
import com.arm.hoc_dagger2.model.XaiTumLum;
import com.arm.hoc_dagger2.model.trongMainActivity.XaiTrongMainActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    XaiTrongMainActivity xaiTrongMainActivity;

    @Inject
    TestInject testInject;

    @Inject
    XaiTumLum xaiTumLum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //xài AndroidInjection.inject(this); để nói rằng mình sẽ có thể xài @Inject
        //từ những cái đã được định nghĩa trong module của RootApplication
        AndroidInjection.inject(this);
        xaiTrongMainActivity.logRa();
        testInject.logRa();
        testInject.abc();
        //trong class này xài dc luôn xaiTrongMainActivity
        xaiTumLum.abc();
    }
}
