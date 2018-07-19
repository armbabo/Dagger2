package com.arm.model.ex2.model;

public class Arm {
    public String arm = "armbabo";
    @Override
    public String toString() {
        return "arm";
    }

    public Arm setArm(String arm) {
        this.arm = arm;
        return this;
    }

    public void toast()
    {
        System.out.println(arm);
    }

}
