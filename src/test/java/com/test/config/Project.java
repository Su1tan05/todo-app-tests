package com.test.config;
import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static DriverConfig config = ConfigFactory.create(DriverConfig.class, System.getProperties());
}
