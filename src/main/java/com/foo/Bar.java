package com.foo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class.getName());

    public boolean doIt(int i) {
        logger.traceEntry("Parameter is {}", i);
        logger.error("Did it again!");
        return logger.traceExit(false);
    }
}
