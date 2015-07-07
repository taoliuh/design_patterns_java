package com.sonaive.adapter;

/**
 * Created by liutao on 15-7-7.
 *
 * European standard plug.
 */
public class EuroPlugImpl implements EuroPlug {

    @Override
    public void chargeWithTwoPins() {
        System.out.printf("Charging, European standard plug, 2.5 A/250 V \n");
    }
}
