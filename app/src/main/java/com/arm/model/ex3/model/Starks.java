package com.arm.model.ex3.model;

import com.arm.model.ex3.House;

import javax.inject.Inject;

/**
 * Created by Hari on 04/11/17.
 */
public class Starks implements House {

    @Inject
    public Starks(){
    }

    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
