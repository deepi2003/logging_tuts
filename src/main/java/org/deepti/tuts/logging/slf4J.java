package org.deepti.tuts.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


public class slf4J {

    private static Logger logger = LoggerFactory.getLogger(slf4J.class);
    public static void main(String[] args) {
      logStatment();
      doNotLogIncludedStatement();
      MDCLogging();
    }

    public static void logStatment() {
        logger.info("Hello world");
    }

    public static void doNotLogIncludedStatement() {
        logger.debug("THIS STATEMENT IS NOT LOGGED.");
    }

    public static void MDCLogging() {
        MDC.put("testMDC", "MDC value");
        logger.info(" This is MDC logger statement");

    }
}
