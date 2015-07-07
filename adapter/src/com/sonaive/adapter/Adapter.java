package com.sonaive.adapter;

/**
 * Created by liutao on 15-7-7.
 */
public class Adapter implements EuroPlug {
    private GBPlug mPlug;

    public Adapter(GBPlug plug) {
        mPlug = plug;
        System.out.printf("Plug in the adapter \n");
    }

    @Override
    public void chargeWithTwoPins() {
        if (mPlug == null) {
            return;
        }
        mPlug.chargeWithThreePins();
    }
}
