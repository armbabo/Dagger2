package com.arm.hoc_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arm.hoc_dagger2.model.trongMainActivity.XaiTrongMainActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    XaiTrongMainActivity xaiTrongMainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //xài AndroidInjection.inject(this); để nói rằng mình sẽ có thể xài @Inject
        //từ những cái đã được định nghĩa trong module của RootApplication
        AndroidInjection.inject(this);
        xaiTrongMainActivity.logRa();
    }
}
