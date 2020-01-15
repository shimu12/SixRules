package com.test.dip;

/**
 * 司机
 */
public class Driver implements IDriver{
    @Override
    public void drive(ICar car) {
        car.run();
    }
}


