package com.sonaive.adapter;

/**
 * Created by liutao on 15-7-7.
 */
public class GBPlugImpl implements GBPlug {

    @Override
    public void chargeWithThreePins() {
        System.out.printf("Charging, China standard plug, 10A,16A/250V \n");
    }
}
